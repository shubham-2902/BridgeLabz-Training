package com.day10.bagnball;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StorageManager manager = new StorageManager();

        while (true) {
            System.out.println("\nTinyTown Bag-n-Ball Organizer");
            System.out.println("1. Add Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display All Balls in a Bag");
            System.out.println("5. Display All Bags and Ball Count");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice) {
                case 1:
                    addBag(manager);
                    break;

                case 2:
                    addBall(manager);
                    break;

                case 3:
                    removeBall(manager);
                    break;

                case 4:
                    displayBalls(manager);
                    break;

                case 5:
                    manager.displayAllBags();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addBag(StorageManager manager) {
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();

        System.out.print("Enter Bag Color: ");
        String color = sc.nextLine();

        System.out.print("Enter Bag Capacity: ");
        int capacity = readInt();

        Bag bag = new Bag(bagId, color, capacity);
        manager.addBag(bag);
    }

    private static void addBall(StorageManager manager) {
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();

        Bag bag = manager.findBag(bagId);
        if (bag == null) {
            System.out.println("Bag not found.");
            return;
        }

        System.out.print("Enter Ball ID: ");
        String ballId = sc.nextLine();

        System.out.print("Enter Ball Color: ");
        String color = sc.nextLine();

        System.out.print("Enter Ball Size (small/medium/large): ");
        String size = sc.nextLine();

        Ball ball = new Ball(ballId, color, size);

        boolean added = bag.addBall(ball);
        if (!added) {
            System.out.println("Cannot add ball. Bag is FULL!");
        } else {
            System.out.println("Ball added successfully.");
        }
    }

    private static void removeBall(StorageManager manager) {
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();

        Bag bag = manager.findBag(bagId);
        if (bag == null) {
            System.out.println("Bag not found.");
            return;
        }

        System.out.print("Enter Ball ID to remove: ");
        String ballId = sc.nextLine();

        Ball removed = bag.removeBall(ballId);
        if (removed == null) {
            System.out.println("Ball not found.");
        } else {
            System.out.println("Removed: " + removed);
        }
    }

    private static void displayBalls(StorageManager manager) {
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();

        Bag bag = manager.findBag(bagId);
        if (bag == null) {
            System.out.println("Bag not found.");
            return;
        }

        bag.displayBalls();
    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }
}
