package com.generics.smartwarehousemgmtsystem;
import java.util.Scanner;

public class SmartWarehouseSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        while (true) {
            System.out.println("\n===== SMART WAREHOUSE MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. Retrieve Item by ID");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    addItem(sc, electronicsStorage, groceriesStorage, furnitureStorage);
                    break;

                case 2:
                    retrieveItem(sc, electronicsStorage, groceriesStorage, furnitureStorage);
                    break;

                case 3:
                    displayItems(sc, electronicsStorage, groceriesStorage, furnitureStorage);
                    break;

                case 4:
                    sc.close();
                    System.out.println("Exiting Smart Warehouse System.");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addItem(
            Scanner sc,
            Storage<Electronics> electronicsStorage,
            Storage<Groceries> groceriesStorage,
            Storage<Furniture> furnitureStorage) {

        System.out.println("\nSelect Item Type:");
        System.out.println("1. Electronics");
        System.out.println("2. Groceries");
        System.out.println("3. Furniture");
        System.out.print("Enter type: ");

        int type = readInt(sc);

        System.out.print("Enter Item ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = readInt(sc);

        if (type == 1) {
            System.out.print("Enter Warranty Months: ");
            int warranty = readInt(sc);

            electronicsStorage.storeItem(new Electronics(id, name, qty, warranty));
            System.out.println("Electronics item stored successfully.");

        } else if (type == 2) {
            System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
            String expiry = sc.nextLine();

            groceriesStorage.storeItem(new Groceries(id, name, qty, expiry));
            System.out.println("Groceries item stored successfully.");

        } else if (type == 3) {
            System.out.print("Enter Material: ");
            String material = sc.nextLine();

            furnitureStorage.storeItem(new Furniture(id, name, qty, material));
            System.out.println("Furniture item stored successfully.");

        } else {
            System.out.println("Invalid type.");
        }
    }

    private static void retrieveItem(
            Scanner sc,
            Storage<Electronics> electronicsStorage,
            Storage<Groceries> groceriesStorage,
            Storage<Furniture> furnitureStorage) {

        System.out.print("\nEnter Item ID to retrieve: ");
        String searchId = sc.nextLine();

        // No casting required because generics enforce return types
        WarehouseItem found = electronicsStorage.retrieveItemById(searchId);

        if (found == null) found = groceriesStorage.retrieveItemById(searchId);
        if (found == null) found = furnitureStorage.retrieveItemById(searchId);

        if (found != null) {
            System.out.println("Item Found: " + found);
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void displayItems(
            Scanner sc,
            Storage<Electronics> electronicsStorage,
            Storage<Groceries> groceriesStorage,
            Storage<Furniture> furnitureStorage) {

        System.out.println("\nWhich storage do you want to display?");
        System.out.println("1. Electronics");
        System.out.println("2. Groceries");
        System.out.println("3. Furniture");
        System.out.println("4. All");
        System.out.print("Enter option: ");

        int displayChoice = readInt(sc);

        if (displayChoice == 1) {
            WarehouseUtil.displayItems(electronicsStorage.getAllItems());

        } else if (displayChoice == 2) {
            WarehouseUtil.displayItems(groceriesStorage.getAllItems());

        } else if (displayChoice == 3) {
            WarehouseUtil.displayItems(furnitureStorage.getAllItems());

        } else if (displayChoice == 4) {
            WarehouseUtil.displayItems(electronicsStorage.getAllItems());
            WarehouseUtil.displayItems(groceriesStorage.getAllItems());
            WarehouseUtil.displayItems(furnitureStorage.getAllItems());

        } else {
            System.out.println("Invalid option.");
        }
    }

    // Prevents Scanner issues by always reading complete line and converting to int
    private static int readInt(Scanner sc) {
        while (true) {
            try {
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Enter again: ");
            }
        }
    }
}
