package com.day1.browserbuddy;
import java.util.Stack;

public class BrowserManager {

    private Tab currentTab;
    private Stack<Tab> closedTabs;

    public BrowserManager() {
        currentTab = new Tab();       // start browser with 1 tab
        closedTabs = new Stack<>();
    }

    public Tab getCurrentTab() {
        return currentTab;
    }

    // Open a new tab
    public void openNewTab() {
        currentTab = new Tab();
        System.out.println("New Tab Opened. Tab ID: " + currentTab.getTabId());
    }

    // Close tab: push into stack
    public void closeCurrentTab() {
        closedTabs.push(currentTab);
        System.out.println("Closed Tab ID: " + currentTab.getTabId());

        // open new blank tab after closing
        currentTab = new Tab();
        System.out.println("Switched to New Tab ID: " + currentTab.getTabId());
    }

    // Restore recently closed tab (LIFO using stack)
    public void restoreClosedTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore.");
            return;
        }

        currentTab = closedTabs.pop();
        System.out.println("Restored Tab ID: " + currentTab.getTabId());
        currentTab.showCurrentPage();
    }
}
