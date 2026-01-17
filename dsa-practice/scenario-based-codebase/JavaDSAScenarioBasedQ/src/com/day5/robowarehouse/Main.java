package com.day5.robowarehouse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum shelf capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        PackageItem[] shelf = new PackageItem[capacity];
        int count = 0;

        ShelfLoader loader = new ShelfLoader();

        while (true) {
            System.out.println("\n1. Add Package");
            System.out.println("2. Display Shelf");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (count == capacity) {
                    System.out.println("Shelf is full. Cannot add more packages.");
                    continue;
                }

                System.out.print("Enter Package ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Weight: ");
                double weight = sc.nextDouble();
                sc.nextLine();

                PackageItem newItem = new PackageItem(id, weight);
                count = loader.addPackage(shelf, count, newItem);

                System.out.println("Package added and shelf kept sorted.");

            } else if (choice == 2) {
                System.out.println("\nShelf Packages (Ascending by Weight):");
                loader.displayShelf(shelf, count);

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
