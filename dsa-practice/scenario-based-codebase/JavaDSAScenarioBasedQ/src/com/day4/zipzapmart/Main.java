package com.day4.zipzapmart;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Format expected from user
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.print("Enter number of sales transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Sale[] sales = new Sale[n];

        System.out.println("\nEnter sales details");
        System.out.println("DateTime format must be: yyyy-MM-dd HH:mm");
        System.out.println("Example: 2026-01-17 14:30\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Transaction " + (i + 1) + ":");

            System.out.print("Enter Transaction ID: ");
            String txnId = sc.nextLine();

            LocalDateTime dateTime = null;

            // Validation loop until correct format is entered
            while (true) {
                try {
                    System.out.print("Enter DateTime (yyyy-MM-dd HH:mm): ");
                    String dateTimeInput = sc.nextLine();
                    dateTime = LocalDateTime.parse(dateTimeInput, formatter);
                    break; // valid input
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid format. Please enter again (Example: 2026-01-17 14:30).");
                }
            }

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine(); // consume newline

            sales[i] = new Sale(txnId, dateTime, amount);
            System.out.println();
        }

        System.out.println("---- Before Sorting ----");
        for (Sale s : sales) {
            System.out.println(s);
        }

        MergeSorter sorter = new MergeSorter();
        sorter.mergeSort(sales, 0, sales.length - 1);

        System.out.println("\n---- After Sorting (DateTime + Amount) ----");
        for (Sale s : sales) {
            System.out.println(s);
        }

        sc.close();
    }
}
