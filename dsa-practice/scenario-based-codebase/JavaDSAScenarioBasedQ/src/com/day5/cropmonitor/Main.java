package com.day5.cropmonitor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.print("Enter number of sensor records: ");
        int n = sc.nextInt();
        sc.nextLine();

        SensorRecord[] data = new SensorRecord[n];

        System.out.println("\nEnter sensor record details");
        System.out.println("Timestamp format: yyyy-MM-dd HH:mm (example: 2026-01-17 06:15)\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Record " + (i + 1) + ":");

            System.out.print("Sensor ID: ");
            String sensorId = sc.nextLine();

            LocalDateTime time = null;
            while (true) {
                try {
                    System.out.print("Timestamp (yyyy-MM-dd HH:mm): ");
                    String input = sc.nextLine();
                    time = LocalDateTime.parse(input, formatter);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid timestamp format. Try again.");
                }
            }

            System.out.print("Soil Temperature: ");
            double temp = sc.nextDouble();
            sc.nextLine();

            data[i] = new SensorRecord(sensorId, time, temp);
            System.out.println();
        }

        SensorSorter sorter = new SensorSorter();

        System.out.println("---- Before Sorting ----");
        sorter.display(data);

        sorter.quickSortByTimestamp(data, 0, data.length - 1);

        System.out.println("\n---- After Sorting (By Timestamp) ----");
        sorter.display(data);

        sc.close();
    }
}
