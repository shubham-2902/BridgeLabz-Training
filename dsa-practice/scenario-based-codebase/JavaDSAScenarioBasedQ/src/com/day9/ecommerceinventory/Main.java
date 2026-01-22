package com.day9.ecommerceinventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductInventoryBST inventory = new ProductInventoryBST();
        Scanner sc = new Scanner(System.in);

        // Preload sample
        inventory.insert(new Product(1050, "Keyboard", 999.0, 25));
        inventory.insert(new Product(1020, "Mouse", 499.0, 40));
        inventory.insert(new Product(1100, "Monitor", 8499.0, 10));

        while (true) {
            System.out.println("\n===== E-Commerce Product Inventory (BST by SKU) =====");
            System.out.println("1. Lookup Product by SKU");
            System.out.println("2. Update Price by SKU");
            System.out.println("3. Display All Products (Sorted by SKU)");
            System.out.println("4. Insert New Product");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter SKU to search: ");
                    int sku = sc.nextInt();
                    Product p = inventory.search(sku);

                    if (p == null) System.out.println("Product not found.");
                    else System.out.println("Found: " + p);
                }
                case 2 -> {
                    System.out.print("Enter SKU: ");
                    int sku = sc.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = sc.nextDouble();

                    boolean updated = inventory.updatePrice(sku, newPrice);
                    if (updated) System.out.println("Price updated successfully.");
                    else System.out.println("SKU not found. Update failed.");
                }
                case 3 -> inventory.displayAllSortedBySKU();

                case 4 -> {
                    System.out.print("Enter SKU: ");
                    int sku = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();

                    inventory.insert(new Product(sku, name, price, stock));
                    System.out.println("Product inserted.");
                }

                case 5 -> {
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
