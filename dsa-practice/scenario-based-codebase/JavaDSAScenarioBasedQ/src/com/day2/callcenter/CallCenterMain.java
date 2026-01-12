package com.day2.callcenter;
import java.util.Scanner;

public class CallCenterMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallCenter callCenter = new CallCenter();

        while (true) {
            System.out.println("\n------ CallCenter System ------");
            System.out.println("1. Add Incoming Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Display Queues");
            System.out.println("4. Display Monthly Call Count");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is VIP? (yes/no): ");
                    String vipInput = sc.nextLine();

                    boolean isVip = vipInput.equalsIgnoreCase("yes");
                    int priority = 999; // default for non VIP

                    if (isVip) {
                        System.out.print("Enter VIP Priority Level (1 = highest): ");
                        priority = sc.nextInt();
                        sc.nextLine();
                    }

                    Customer customer = new Customer(id, name, isVip, priority);
                    callCenter.addCall(customer);
                    break;

                case 2:
                    callCenter.handleNextCall();
                    break;

                case 3:
                    callCenter.displayQueues();
                    break;

                case 4:
                    callCenter.showCallCounts();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
