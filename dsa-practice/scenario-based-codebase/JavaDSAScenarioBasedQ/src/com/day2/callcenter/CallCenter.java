package com.day2.callcenter;
import java.util.*;

public class CallCenter {

    private Queue<Customer> normalQueue;
    private PriorityQueue<Customer> vipQueue;
    private HashMap<String, Integer> callCountMap;

    public CallCenter() {

        normalQueue = new LinkedList<>();

        // VIP priority based on priorityLevel (smaller level = higher priority)
        vipQueue = new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return Integer.compare(c1.getPriorityLevel(), c2.getPriorityLevel());
            }
        });

        callCountMap = new HashMap<>();
    }

    // Incoming call
    public void addCall(Customer customer) {

        // add to VIP queue or normal queue
        if (customer.isVip()) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        // update call count in hashmap
        callCountMap.put(customer.getCustomerId(),
                callCountMap.getOrDefault(customer.getCustomerId(), 0) + 1);

        System.out.println("Call added: " + customer);
    }

    // Handle next call
    public void handleNextCall() {

        Customer nextCustomer = null;

        // VIP always gets first preference
        if (!vipQueue.isEmpty()) {
            nextCustomer = vipQueue.poll();   // remove from vip queue
        } else if (!normalQueue.isEmpty()) {
            nextCustomer = normalQueue.poll(); // remove from normal queue
        }

        if (nextCustomer == null) {
            System.out.println("No calls pending.");
        } else {
            System.out.println("Handling call: " + nextCustomer);
        }
    }

    // Display queues
    public void displayQueues() {

        System.out.println("\nVIP Queue:");
        if (vipQueue.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Customer c : vipQueue) {
                System.out.println(c);
            }
        }

        System.out.println("\nNormal Queue:");
        if (normalQueue.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Customer c : normalQueue) {
                System.out.println(c);
            }
        }
    }

    // Display customer monthly call count
    public void showCallCounts() {
        if (callCountMap.isEmpty()) {
            System.out.println("No call records.");
            return;
        }

        System.out.println("\nCustomer Call Count (This Month):");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println("CustomerID: " + entry.getKey() + " -> Calls: " + entry.getValue());
        }
    }
}
