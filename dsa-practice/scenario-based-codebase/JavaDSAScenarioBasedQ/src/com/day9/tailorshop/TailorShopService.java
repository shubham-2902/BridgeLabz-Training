package com.day9.tailorshop;
import java.util.ArrayList;
import java.util.List;

public class TailorShopService {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        insertOrderSorted(order);
    }

    // Insertion Sort style: insert new order in correct deadline position
    private void insertOrderSorted(Order order) {
        if (orders.isEmpty()) {
            orders.add(order);
            return;
        }

        int newDeadline = DateOperation.toSortableDate(order.getDeliveryDate());

        // Create space at end
        orders.add(null);

        int i = orders.size() - 2;

        // Shift orders with later deadlines to the right
        while (i >= 0) {
            int currDeadline = DateOperation.toSortableDate(orders.get(i).getDeliveryDate());

            // Use '>' to keep stability (same deadline: older orders stay first)
            if (currDeadline > newDeadline) {
                orders.set(i + 1, orders.get(i));
                i--;
            } else {
                break;
            }
        }

        orders.set(i + 1, order);
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders available.");
            return;
        }

        System.out.println("\nOrders (Earliest Deadline First):");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println((i + 1) + ") " + orders.get(i));
        }
    }

    public boolean isEmpty() {
        return orders.isEmpty();
    }
}
