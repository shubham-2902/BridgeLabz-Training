package com.day1.ambulanceroute;
import java.util.Scanner;

public class AmbulanceRouteMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalRoute route = new HospitalRoute();

        // Default units
        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        while (true) {
            System.out.println("\n------ AmbulanceRoute System ------");
            System.out.println("1. Display Route");
            System.out.println("2. Redirect Patient");
            System.out.println("3. Mark Unit Available");
            System.out.println("4. Mark Unit Unavailable");
            System.out.println("5. Remove Unit (Maintenance)");
            System.out.println("6. Add New Unit");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    route.displayRoute();
                    break;

                case 2:
                    System.out.print("Enter start unit: ");
                    String start = sc.nextLine();
                    route.redirectPatient(start);
                    break;

                case 3:
                    System.out.print("Enter unit name: ");
                    String u1 = sc.nextLine();
                    route.setAvailability(u1, true);
                    break;

                case 4:
                    System.out.print("Enter unit name: ");
                    String u2 = sc.nextLine();
                    route.setAvailability(u2, false);
                    break;

                case 5:
                    System.out.print("Enter unit name to remove: ");
                    String rem = sc.nextLine();
                    route.removeUnit(rem);
                    break;

                case 6:
                    System.out.print("Enter new unit name: ");
                    String newUnit = sc.nextLine();
                    route.addUnit(newUnit);
                    break;

                case 7:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
