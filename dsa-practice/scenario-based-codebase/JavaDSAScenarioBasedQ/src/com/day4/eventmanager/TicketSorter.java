package com.day4.eventmanager;
import java.util.Random;

public class TicketSorter {

    private final Random random = new Random();

    // Sort by price (ascending)
    public void quickSortByPrice(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int pivotIndex = randomizedPartition(tickets, low, high);
            quickSortByPrice(tickets, low, pivotIndex - 1);
            quickSortByPrice(tickets, pivotIndex + 1, high);
        }
    }

    // Random pivot reduces worst-case chances
    private int randomizedPartition(Ticket[] tickets, int low, int high) {
        int pivotIdx = low + random.nextInt(high - low + 1);
        swap(tickets, pivotIdx, high);
        return partition(tickets, low, high);
    }

    // Lomuto partition scheme
    private int partition(Ticket[] tickets, int low, int high) {
        double pivotPrice = tickets[high].getPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].getPrice() <= pivotPrice) {
                i++;
                swap(tickets, i, j);
            }
        }

        swap(tickets, i + 1, high);
        return i + 1;
    }

    private void swap(Ticket[] tickets, int i, int j) {
        Ticket temp = tickets[i];
        tickets[i] = tickets[j];
        tickets[j] = temp;
    }

    // Print top K cheapest tickets (after sorting asc)
    public void printTopKCheapest(Ticket[] tickets, int k) {
        int limit = Math.min(k, tickets.length);
        for (int i = 0; i < limit; i++) {
            System.out.println(tickets[i]);
        }
    }

    // Print top K most expensive tickets (after sorting asc)
    public void printTopKMostExpensive(Ticket[] tickets, int k) {
        int limit = Math.min(k, tickets.length);
        for (int i = tickets.length - 1; i >= tickets.length - limit; i--) {
            System.out.println(tickets[i]);
        }
    }
}
