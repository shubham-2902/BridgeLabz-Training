package com.encapsulationandpolymorphism.librarymgmtsysytem;

public class DVD extends LibraryItem implements Reservable {

    private boolean available = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrowerName(borrowerName);
            available = false;
            System.out.println("DVD reserved successfully");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
