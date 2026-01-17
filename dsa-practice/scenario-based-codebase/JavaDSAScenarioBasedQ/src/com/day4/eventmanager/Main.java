package com.day4.eventmanager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();
        sc.nextLine();

        Ticket[] tickets = new Ticket[n];

        System.out.println("\nEnter ticket details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ticket " + (i + 1) + ":");

            System.out.print("Ticket ID: ");
            String id = sc.nextLine();

            System.out.print("Event Name: ");
            String event = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            tickets[i] = new Ticket(id, event, price);
            System.out.println();
        }

        TicketSorter sorter = new TicketSorter();

        sorter.quickSortByPrice(tickets, 0, tickets.length - 1);

        System.out.print("Enter K (top cheapest/expensive): ");
        int k = sc.nextInt();

        System.out.println("\nTop " + k + " Cheapest Tickets:");
        sorter.printTopKCheapest(tickets, k);

        System.out.println("\nTop " + k + " Most Expensive Tickets:");
        sorter.printTopKMostExpensive(tickets, k);

        sc.close();
    }
}
