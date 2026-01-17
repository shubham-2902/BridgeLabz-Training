package com.day5.robowarehouse;
public class ShelfLoader {

    // Insert new package into sorted shelf (ascending by weight)
    public int addPackage(PackageItem[] shelf, int count, PackageItem newItem) {
        shelf[count] = newItem;
        count++;

        // Insertion sort-style insertion: only fix the last inserted element
        int i = count - 1;
        while (i > 0 && shelf[i - 1].getWeight() > shelf[i].getWeight()) {
            PackageItem temp = shelf[i];
            shelf[i] = shelf[i - 1];
            shelf[i - 1] = temp;
            i--;
        }
        return count;
    }

    public void displayShelf(PackageItem[] shelf, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(shelf[i]);
        }
    }
}
