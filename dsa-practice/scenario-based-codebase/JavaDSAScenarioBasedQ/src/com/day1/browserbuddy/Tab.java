package com.day1.browserbuddy;
public class Tab {
    private static int counter = 1;

    private int tabId;
    private HistoryNode head;
    private HistoryNode current;

    public Tab() {
        this.tabId = counter++;
        this.head = null;
        this.current = null;
    }

    public int getTabId() {
        return tabId;
    }

    // Visit a new URL
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        // If first page
        if (head == null) {
            head = newNode;
            current = newNode;
            return;
        }

        // If user visited after going back -> delete forward history
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
        }

        // Connect new node
        current.next = newNode;
        newNode.prev = current;

        // Move current
        current = newNode;
    }

    // Go back (current = current.prev)
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("Cannot go back.");
            return;
        }
        current = current.prev;
        System.out.println("Current Page: " + current.url);
    }

    // Go forward (current = current.next)
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("Cannot go forward.");
            return;
        }
        current = current.next;
        System.out.println("Current Page: " + current.url);
    }

    public void showCurrentPage() {
        if (current == null) {
            System.out.println("No pages visited in this tab yet.");
        } else {
            System.out.println("Current Page: " + current.url);
        }
    }

    // Print complete browsing history
    public void displayHistory() {
        if (head == null) {
            System.out.println("No history available.");
            return;
        }

        System.out.println("Tab " + tabId + " History:");
        HistoryNode temp = head;

        while (temp != null) {
            if (temp == current) {
                System.out.println("-> " + temp.url + " (Current)");
            } else {
                System.out.println("   " + temp.url);
            }
            temp = temp.next;
        }
    }
}
