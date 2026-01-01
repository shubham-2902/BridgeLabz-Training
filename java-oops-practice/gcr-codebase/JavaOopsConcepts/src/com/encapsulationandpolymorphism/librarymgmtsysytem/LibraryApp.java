package com.encapsulationandpolymorphism.librarymgmtsysytem;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Basics", "James"));
        items.add(new Magazine(2, "Tech Monthly", "Editorial Team"));
        items.add(new DVD(3, "Learning Java", "Oracle"));

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;

                if (reservable.checkAvailability()) {
                    reservable.reserveItem("Amit");
                }
            }

            System.out.println("-------------------------------");
        }
    }
}
