package com.day5.cinemahouse;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Enter number of shows today: ");
        int n = sc.nextInt();
        sc.nextLine();

        Show[] shows = new Show[n];

        System.out.println("\nEnter show details (Time format HH:mm, example 18:30):");

        for (int i = 0; i < n; i++) {
            System.out.println("Show " + (i + 1) + ":");

            System.out.print("Movie Name: ");
            String movie = sc.nextLine();

            LocalTime time = null;
            while (true) {
                try {
                    System.out.print("Show Time (HH:mm): ");
                    String input = sc.nextLine();
                    time = LocalTime.parse(input, formatter);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid time format. Try again.");
                }
            }

            shows[i] = new Show(movie, time);
            System.out.println();
        }

        ShowSorter sorter = new ShowSorter();

        System.out.println("---- Before Sorting ----");
        sorter.display(shows);

        sorter.bubbleSortShows(shows);

        System.out.println("\n---- After Sorting (By Show Time) ----");
        sorter.display(shows);

        sc.close();
    }
}
