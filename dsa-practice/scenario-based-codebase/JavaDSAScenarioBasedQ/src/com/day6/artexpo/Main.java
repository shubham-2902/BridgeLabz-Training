package com.day6.artexpo;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Enter max number of registrations today: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        Artist[] artists = new Artist[capacity];
        int count = 0;

        RegistrationManager manager = new RegistrationManager();

        while (true) {
            System.out.println("\n1. Register Artist");
            System.out.println("2. View Booth Assignment List (Sorted)");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (count == capacity) {
                    System.out.println("Registration list full.");
                    continue;
                }

                System.out.print("Enter Artist ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Artist Name: ");
                String name = sc.nextLine();

                LocalTime regTime;
                while (true) {
                    try {
                        System.out.print("Enter Registration Time (HH:mm): ");
                        String t = sc.nextLine();
                        regTime = LocalTime.parse(t, formatter);
                        break;
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid time format. Try again.");
                    }
                }

                count = manager.addArtist(artists, count, new Artist(id, name, regTime));
                System.out.println("Artist registered and sorted by time.");

            } else if (choice == 2) {
                System.out.println("\nBooth Assignment List (By Registration Time):");
                manager.display(artists, count);

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
