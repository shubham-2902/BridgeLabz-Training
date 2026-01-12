package com.day1.browserbuddy;
import java.util.Scanner;

public class BrowserBuddyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserManager browser = new BrowserManager();

        while (true) {
            System.out.println("\n------ BrowserBuddy ------");
            System.out.println("Current Tab ID: " + browser.getCurrentTab().getTabId());
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Display Tab History");
            System.out.println("6. Open New Tab");
            System.out.println("7. Close Current Tab");
            System.out.println("8. Restore Closed Tab");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.getCurrentTab().visit(url);
                    browser.getCurrentTab().showCurrentPage();
                    break;

                case 2:
                    browser.getCurrentTab().back();
                    break;

                case 3:
                    browser.getCurrentTab().forward();
                    break;

                case 4:
                    browser.getCurrentTab().showCurrentPage();
                    break;

                case 5:
                    browser.getCurrentTab().displayHistory();
                    break;

                case 6:
                    browser.openNewTab();
                    break;

                case 7:
                    browser.closeCurrentTab();
                    break;

                case 8:
                    browser.restoreClosedTab();
                    break;

                case 9:
                    System.out.println("Exiting BrowserBuddy...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
