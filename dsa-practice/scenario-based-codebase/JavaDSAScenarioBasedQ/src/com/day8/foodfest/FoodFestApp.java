package com.day8.foodfest;
import java.util.List;
import java.util.Scanner;

public class FoodFestApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodFestService service = new FoodFestService();
        MergeSortFootfall sorter = new MergeSortFootfall();

        while (true) {
            System.out.println("\n=== FoodFest Stall Footfall Analyzer ===");
            System.out.println("1. Add stall footfall log (zone-wise)");
            System.out.println("2. Display zone-wise logs");
            System.out.println("3. Generate master sorted list (Merge Sort)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter zone (e.g., Zone-A): ");
                    String zone = readLine(sc);

                    System.out.print("Enter stall name: ");
                    String stall = readLine(sc);

                    System.out.print("Enter footfall count: ");
                    int footfall = readInt(sc);

                    service.addStallLog(zone, new StallFootfall(stall, footfall, zone));
                    System.out.println("Log added to " + zone);
                    break;

                case 2:
                    service.printZoneWise();
                    break;

                case 3:
                    List<StallFootfall> master = service.getMasterList();
                    sorter.sort(master);

                    System.out.println("\nMaster List (Footfall DESC):");
                    for (int i = 0; i < master.size(); i++) {
                        System.out.println((i + 1) + ") " + master.get(i));
                    }
                    break;

                case 4:
                    System.out.println("Exiting FoodFest...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a valid number: ");
        }
        int val = sc.nextInt();
        sc.nextLine();
        return val;
    }

    private static String readLine(Scanner sc) {
        String line = sc.nextLine();
        while (line.trim().isEmpty()) line = sc.nextLine();
        return line;
    }
}
