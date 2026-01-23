package com.day10.ticketbookingmgmt;
public class EventAVLTree {

    private EventNode root;

    // Compare based on time (primary) and eventName (secondary)
    // Why secondary? Because two events can happen at same time.
    private int compare(int time1, String name1, int time2, String name2) {
        if (time1 != time2) return Integer.compare(time1, time2);
        return name1.compareTo(name2);
    }

    private int height(EventNode node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(EventNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // LL rotation
    private EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    // RR rotation
    private EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    // ==========================
    // INSERT EVENT
    // ==========================
    public void insertEvent(int time, String eventName) {
        root = insert(root, time, eventName);
    }

    private EventNode insert(EventNode node, int time, String eventName) {

        if (node == null) return new EventNode(time, eventName);

        int cmp = compare(time, eventName, node.time, node.eventName);

        if (cmp < 0) node.left = insert(node.left, time, eventName);
        else if (cmp > 0) node.right = insert(node.right, time, eventName);
        else return node; // exact duplicate (same time+same name) not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && compare(time, eventName, node.left.time, node.left.eventName) < 0)
            return rightRotate(node);

        // RR
        if (balance < -1 && compare(time, eventName, node.right.time, node.right.eventName) > 0)
            return leftRotate(node);

        // LR
        if (balance > 1 && compare(time, eventName, node.left.time, node.left.eventName) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && compare(time, eventName, node.right.time, node.right.eventName) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // ==========================
    // DELETE EVENT
    // ==========================
    public void cancelEvent(int time, String eventName) {
        root = delete(root, time, eventName);
    }

    private EventNode minValueNode(EventNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    private EventNode delete(EventNode node, int time, String eventName) {

        if (node == null) return null;

        int cmp = compare(time, eventName, node.time, node.eventName);

        if (cmp < 0) node.left = delete(node.left, time, eventName);
        else if (cmp > 0) node.right = delete(node.right, time, eventName);
        else {
            // Found node to delete
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                EventNode temp = minValueNode(node.right);
                node.time = temp.time;
                node.eventName = temp.eventName;
                node.right = delete(node.right, temp.time, temp.eventName);
            }
        }

        if (node == null) return null;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && getBalance(node.left) >= 0)
            return rightRotate(node);

        // LR
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && getBalance(node.right) <= 0)
            return leftRotate(node);

        // RL
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // ==========================
    // DISPLAY EVENTS IN ORDER
    // ==========================
    public void displayUpcomingEvents() {
        if (root == null) {
            System.out.println("No events available.");
            return;
        }

        System.out.println("\n--- UPCOMING EVENTS (SORTED BY TIME) ---");
        inorder(root);
    }

    private void inorder(EventNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(formatTime(node.time) + " -> " + node.eventName);
        inorder(node.right);
    }

    // ==========================
    // Helper: Convert 930 -> 09:30
    // ==========================
    public static String formatTime(int time) {
        int hours = time / 100;
        int minutes = time % 100;
        return String.format("%02d:%02d", hours, minutes);
    }
}
