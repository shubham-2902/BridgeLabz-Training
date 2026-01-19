package com.day10.bagnball;
import java.util.ArrayList;

public class StorageManager {
    private ArrayList<Bag> bags;

    public StorageManager() {
        bags = new ArrayList<>();
    }

    // Add bag
    public void addBag(Bag bag) {
        bags.add(bag);
        System.out.println("Bag added successfully.");
    }

    // Find bag by ID
    public Bag findBag(String bagId) {
        for (Bag bag : bags) {
            if (bag.getId().equalsIgnoreCase(bagId)) {
                return bag;
            }
        }
        return null;
    }

    // Display all bags with ball count
    public void displayAllBags() {
        if (bags.isEmpty()) {
            System.out.println("No bags available.");
            return;
        }

        System.out.println("\n--- All Bags ---");
        for (Bag bag : bags) {
            System.out.println(bag);
        }
    }
}
