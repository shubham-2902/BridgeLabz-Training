package com.day3.smartcheckout;
import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue;
    private HashMap<String, Product> inventory;  // itemName -> product details

    public SmartCheckout() {
        customerQueue = new LinkedList<>();
        inventory = new HashMap<>();
    }

    // Add product to inventory
    public void addProduct(Product product) {
        inventory.put(product.getName().toLowerCase(), product);
    }

    // Display inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No items available.");
            return;
        }

        System.out.println("\nInventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Customer added to checkout queue: " + customer.getCustomerName());
    }

    // Remove (process) customer from queue
    public void processNextCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        System.out.println("\nProcessing customer: " + customer.getCustomerName());

        double totalBill = 0.0;

        for (Map.Entry<String, Integer> entry : customer.getCart().entrySet()) {
            String itemName = entry.getKey().toLowerCase();
            int qty = entry.getValue();

            // check item exists
            if (!inventory.containsKey(itemName)) {
                System.out.println("Item not found: " + entry.getKey());
                continue;
            }

            Product product = inventory.get(itemName);

            // check stock
            if (product.getStock() < qty) {
                System.out.println("Insufficient stock for: " + product.getName()
                        + " | Requested: " + qty + " | Available: " + product.getStock());
                continue;
            }

            // calculate price
            double cost = product.getPrice() * qty;
            totalBill += cost;

            // update stock
            product.reduceStock(qty);

            System.out.println("Purchased: " + product.getName()
                    + " | Qty: " + qty
                    + " | Cost: " + cost);
        }

        System.out.println("Total Bill for " + customer.getCustomerName() + ": " + totalBill);
    }

    // Show customers in queue
    public void displayCustomerQueue() {
        if (customerQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("\nCustomers in queue:");
        for (Customer c : customerQueue) {
            System.out.println("- " + c.getCustomerName());
        }
    }
}
