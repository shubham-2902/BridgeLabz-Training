package com.day6.fleetmanager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MaintenanceScheduler scheduler = new MaintenanceScheduler();

        System.out.print("Enter number of depots: ");
        int depots = sc.nextInt();
        sc.nextLine();

        Vehicle[] master = new Vehicle[0];

        for (int d = 1; d <= depots; d++) {
            System.out.println("\nDepot " + d + " details:");

            System.out.print("Depot Name: ");
            String depotName = sc.nextLine();

            System.out.print("Enter number of vehicles in this depot: ");
            int n = sc.nextInt();
            sc.nextLine();

            Vehicle[] depotVehicles = new Vehicle[n];

            System.out.println("Enter vehicles (sorted by mileage ASC):");
            for (int i = 0; i < n; i++) {
                System.out.println("Vehicle " + (i + 1) + ":");

                System.out.print("Vehicle ID: ");
                String id = sc.nextLine();

                System.out.print("Model: ");
                String model = sc.nextLine();

                System.out.print("Mileage: ");
                int mileage = sc.nextInt();
                sc.nextLine();

                depotVehicles[i] = new Vehicle(id, model, mileage, depotName);
                System.out.println();
            }

            // Merge depot list into master schedule
            master = scheduler.mergeTwoDepots(master, depotVehicles);
        }

        System.out.print("\nHow many top maintenance priority vehicles to show? ");
        int topN = sc.nextInt();

        scheduler.printSchedule(master, topN);

        sc.close();
    }
}
