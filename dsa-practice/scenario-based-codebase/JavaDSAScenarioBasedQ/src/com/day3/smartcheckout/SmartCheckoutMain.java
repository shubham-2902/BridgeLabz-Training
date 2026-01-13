package com.day3.smartcheckout;
import java.util.Scanner;

public class SmartCheckoutMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();

        // Default inventory
        checkout.addProduct(new Product("Milk", 50.0, 20));
        checkout.addProduct(new Product("Bread", 30.0, 15));
        checkout.addProduct(new Product("Rice", 60.0, 25));
        checkout.addProduct(new Product("Sugar", 45.0, 10));

        while (true) {
            System.out.println("\n------ SmartCheckout ------");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Customer to Queue");
            System.out.println("3. Process Next Customer");
            System.out.println("4. Display Customer Queue");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    checkout.displayInventory();
                    break;

                case 2:
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();

                    Customer customer = new Customer(customerName);

                    System.out.print("How many different items? ");
                    int itemCount = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= itemCount; i++) {
                        System.out.print("Enter item name " + i + ": ");
                        String itemName = sc.nextLine();

                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        sc.nextLine();

                        customer.addItem(itemName, qty);
                    }

                    checkout.addCustomer(customer);
                    break;

                case 3:
                    checkout.processNextCustomer();
                    break;

                case 4:
                    checkout.displayCustomerQueue();
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
