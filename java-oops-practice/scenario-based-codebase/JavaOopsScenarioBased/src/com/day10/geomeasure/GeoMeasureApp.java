package com.day10.geomeasure;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to GeoMeasure Solutions - Line Segment Comparator");

        // Bonus: store multiple comparisons
        ArrayList<LineComparison> history = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Compare Two Lines");
            System.out.println("2. Show Comparison History");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice) {
                case 1 -> {
                    Line line1 = readLineFromUser("Line 1");
                    Line line2 = readLineFromUser("Line 2");

                    // Create comparison object
                    LineComparison comparison = new LineComparison(line1, line2);

                    // Store into list
                    history.add(comparison);

                    // Display result
                    comparison.displayComparison();
                }

                case 2 -> {
                    if (history.isEmpty()) {
                        System.out.println("No comparisons done yet.");
                    } else {
                        System.out.println("\n--- Comparison History ---");
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println("Comparison #" + (i + 1));
                            history.get(i).displayComparison();
                        }
                    }
                }

                case 3 -> {
                    System.out.println("Exiting GeoMeasure App...");
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static Line readLineFromUser(String label) {
        System.out.println("\nEnter coordinates for " + label);

        System.out.print("x1: ");
        double x1 = readDouble();

        System.out.print("y1: ");
        double y1 = readDouble();

        System.out.print("x2: ");
        double x2 = readDouble();

        System.out.print("y2: ");
        double y2 = readDouble();

        // Object created using constructor
        return new Line(x1, y1, x2, y2);
    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid integer: ");
            }
        }
    }

    private static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }
}
