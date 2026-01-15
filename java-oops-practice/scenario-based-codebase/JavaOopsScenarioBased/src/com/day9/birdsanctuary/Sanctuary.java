package com.day9.birdsanctuary;
import java.util.ArrayList;

public class Sanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully!");
    }

    public void displayAllBirds() {
        if (birds.isEmpty()) {
            System.out.println("No birds found in sanctuary.");
            return;
        }
        for (Bird b : birds) {
            b.displayInfo();
            b.eat(); // polymorphic call
            System.out.println("--------------------------------");
        }
    }

    public void displayFlyingBirds() {
        boolean found = false;
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                found = true;
                b.displayInfo();
                ((Flyable) b).fly();  // polymorphism via interface
                System.out.println("--------------------------------");
            }
        }
        if (!found) System.out.println("No flying birds found.");
    }

    public void displaySwimmingBirds() {
        boolean found = false;
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                found = true;
                b.displayInfo();
                ((Swimmable) b).swim();
                System.out.println("--------------------------------");
            }
        }
        if (!found) System.out.println("No swimming birds found.");
    }

    public void displayBothFlyAndSwimBirds() {
        boolean found = false;
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                found = true;
                b.displayInfo();
                ((Flyable) b).fly();
                ((Swimmable) b).swim();
                System.out.println("--------------------------------");
            }
        }
        if (!found) System.out.println("No birds found that can both fly and swim.");
    }

    public void deleteBirdById(String id) {
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getId().equalsIgnoreCase(id)) {
                System.out.println(" Removed bird: " + birds.get(i).getName());
                birds.remove(i);
                return;
            }
        }
        System.out.println("Bird with ID " + id + " not found.");
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean canFly = b instanceof Flyable;
            boolean canSwim = b instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else neither++;
        }

        System.out.println("\nSanctuary Report");
        System.out.println("Total Birds: " + birds.size());
        System.out.println("Flyable Birds: " + fly);
        System.out.println("Swimmable Birds: " + swim);
        System.out.println("Both Fly & Swim: " + both);
        System.out.println("Neither: " + neither);
    }
}
