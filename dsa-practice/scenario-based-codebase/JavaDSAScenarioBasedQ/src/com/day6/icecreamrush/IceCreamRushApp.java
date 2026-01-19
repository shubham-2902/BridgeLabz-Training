package com.day6.icecreamrush;
public class IceCreamRushApp {

    public static void main(String[] args) {
        Flavor[] flavors = new Flavor[] {
                new Flavor("Vanilla", 120),
                new Flavor("Chocolate", 145),
                new Flavor("Mango", 98),
                new Flavor("Strawberry", 110),
                new Flavor("Butterscotch", 105),
                new Flavor("Pineapple", 90),
                new Flavor("Pista", 70),
                new Flavor("Kesar", 80)
        };

        System.out.println("Before Sorting:");
        printFlavors(flavors);

        BubbleSortBySales sorter = new BubbleSortBySales();
        sorter.sort(flavors);

        System.out.println("\nAfter Sorting (Most Popular First):");
        printFlavors(flavors);
    }

    private static void printFlavors(Flavor[] flavors) {
        for (Flavor f : flavors) {
            System.out.println(f);
        }
    }
}
