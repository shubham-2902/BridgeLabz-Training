package com.day2.trafficmanager;
import java.util.Scanner;

public class TrafficManagerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roundabout max capacity: ");
        int capacity = sc.nextInt();

        System.out.print("Enter waiting queue max size: ");
        int queueSize = sc.nextInt();
        sc.nextLine();

        TrafficManager manager = new TrafficManager(capacity, queueSize);

        while (true) {
            System.out.println("\n------ TrafficManager ------");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Print State");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String addVehicle = sc.nextLine();
                    manager.addVehicle(addVehicle);
                    break;

                case 2:
                    System.out.print("Enter vehicle number to remove: ");
                    String removeVehicle = sc.nextLine();
                    manager.removeVehicle(removeVehicle);
                    break;

                case 3:
                    manager.printState();
                    break;

                case 4:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
