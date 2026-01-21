package com.day9.medwarehouse;

import java.util.List;
import java.util.Scanner;

public class MedWarehouseApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedWarehouseService service = new MedWarehouseService();

        while (true) {
            System.out.println("\n=== MedWarehouse (Merge Sort by Expiry) ===");
            System.out.println("1. Add medicine record (branch-wise)");
            System.out.println("2. Display branch-wise records");
            System.out.println("3. Generate & display master sorted list (expiry ASC)");
            System.out.println("4. Alert near-expiry medicines (expiry <= cutoff date)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter branch name: ");
                    String branch = readLine(sc);

                    System.out.print("Enter batch ID: ");
                    String batchId = readLine(sc);

                    System.out.print("Enter medicine name: ");
                    String name = readLine(sc);

                    System.out.print("Enter quantity: ");
                    int qty = readInt(sc);

                    System.out.print("Enter expiry date (YYYY-MM-DD): ");
                    String expiry = readLine(sc);

                    if (!DateUtil.isValidDate(expiry)) {
                        System.out.println("Invalid expiry date format. Example: 2026-01-21");
                        break;
                    }

                    Medicine medicine = new Medicine(batchId, name, qty, expiry, branch);
                    service.addMedicine(branch, medicine);

                    System.out.println("Medicine record added.");
                    break;

                case 2:
                    service.displayBranchWiseData();
                    break;

                case 3:
                    List<Medicine> master = service.getMasterSortedList();
                    if (master.isEmpty()) {
                        System.out.println("No medicines available.");
                        break;
                    }

                    System.out.println("\nMaster Sorted List (Earliest Expiry First):");
                    for (int i = 0; i < master.size(); i++) {
                        System.out.println((i + 1) + ") " + master.get(i));
                    }
                    break;

                case 4:
                    if (!service.hasAnyData()) {
                        System.out.println("No medicines available. Add records first.");
                        break;
                    }

                    System.out.print("Enter cutoff date (YYYY-MM-DD): ");
                    String cutoff = readLine(sc);

                    if (!DateUtil.isValidDate(cutoff)) {
                        System.out.println("Invalid cutoff date format. Example: 2026-02-01");
                        break;
                    }

                    List<Medicine> alerts = service.getNearExpiryMedicines(cutoff);

                    if (alerts.isEmpty()) {
                        System.out.println("No medicines nearing expiry for cutoff: " + cutoff);
                        break;
                    }

                    System.out.println("\nALERT: Medicines expiring on/before " + cutoff + ":");
                    for (int i = 0; i < alerts.size(); i++) {
                        System.out.println((i + 1) + ") " + alerts.get(i));
                    }
                    break;

                case 5:
                    System.out.println("Exiting MedWarehouse...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a valid number: ");
        }
        int val = sc.nextInt();
        sc.nextLine(); // consume newline
        return val;
    }

    private static String readLine(Scanner sc) {
        String line = sc.nextLine();
        while (line.trim().isEmpty()) {
            line = sc.nextLine();
        }
        return line;
    }
}
