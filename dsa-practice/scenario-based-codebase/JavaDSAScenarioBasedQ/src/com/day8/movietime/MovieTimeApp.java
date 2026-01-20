package com.day8.movietime;
import java.util.Scanner;

public class MovieTimeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTimeService service = new MovieTimeService();
        InsertionSortShowsByTime sorter = new InsertionSortShowsByTime();

        while (true) {
            System.out.println("\n=== MovieTime: Theater Show Listings ===");
            System.out.println("1. Add new show");
            System.out.println("2. Display shows (current order)");
            System.out.println("3. Sort showtimes (Insertion Sort)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String movie = readLine(sc);

                    System.out.print("Enter show time (HH:mm): ");
                    String time = readLine(sc);

                    if (!TimeUtil.isValidHHMM(time)) {
                        System.out.println("Invalid time format. Example: 18:45");
                        break;
                    }

                    service.addShow(new Show(movie, time));

                    // list is almost sorted → insertion sort is ideal to keep it ordered anytime
                    sorter.sort(service.getShows());
                    System.out.println("Show added and placed in correct time slot.");
                    break;

                case 2:
                    service.printShows();
                    break;

                case 3:
                    sorter.sort(service.getShows());
                    System.out.println("Sorted by showtime (ASC).");
                    service.printShows();
                    break;

                case 4:
                    System.out.println("Exiting MovieTime...");
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
        while (line.trim().isEmpty()) {
            line = sc.nextLine();
        }
        return line;
    }
}
