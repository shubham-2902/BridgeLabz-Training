package com.day3.parceltracker;
import java.util.Scanner;

public class ParcelMain {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to ParcelTracker System");

        do {
            System.out.println("\n1. Add Main Delivery Stage");
            System.out.println("2. Insert Custom Checkpoint");
            System.out.println("3. Track Parcel Path");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter stage name (e.g., Packed, Shipped): ");
                    tracker.addStage(sc.nextLine());
                    break;
                case 2:
                    System.out.print("After which stage should we add a checkpoint? ");
                    String target = sc.nextLine();
                    System.out.print("Enter new checkpoint name: ");
                    String newCP = sc.nextLine();
                    if (!tracker.addCheckpoint(target, newCP)) {
                        System.out.println("Error: Stage not found.");
                    }
                    break;
                case 3:
                    tracker.displayTracking();
                    break;
                case 4:
                    System.out.println("Exiting Tracker...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        
        sc.close();
    }
}