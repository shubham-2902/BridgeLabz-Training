package com.day9.tailorshop;

import java.util.Scanner;

public class TailorShopApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TailorShopService service = new TailorShopService();

        while (true) {
            System.out.println("\n=== TailorShop: Deadline Order Manager ===");
            System.out.println("1. Add new order");
            System.out.println("2. Display all orders (sorted by deadline)");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String customerName = readLine(sc);

                    System.out.print("Enter Order ID: ");
                    String orderId = readLine(sc);

                    System.out.print("Enter Delivery Deadline (YYYY-MM-DD): ");
                    String deliveryDate = readLine(sc);

                    if (!DateOperation.isValidDate(deliveryDate)) {
                        System.out.println("Invalid date format. Example: 2026-01-21");
                        break;
                    }

                    Order order = new Order(customerName, orderId, deliveryDate);
                    service.addOrder(order);

                    System.out.println("Order added in correct deadline slot.");
                    break;

                case 2:
                    service.displayOrders();
                    break;

                case 3:
                    System.out.println("Exiting TailorShop...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a valid number: ");
        }
        int val = sc.nextInt();
        sc.nextLine(); // consume newline
        return val;
    }

    private static String readLine(Scanner sc) {
        String line = sc.nextLine();
        while (line.trim().isEmpty()) {
            line = sc.nextLine();
        }
        return line;
    }
}
