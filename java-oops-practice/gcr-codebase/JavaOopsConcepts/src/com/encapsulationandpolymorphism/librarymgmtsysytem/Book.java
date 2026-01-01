package com.encapsulationandpolymorphism.librarymgmtsysytem;

public class Book extends LibraryItem implements Reservable {

    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrowerName(borrowerName);
            available = false;
            System.out.println("Book reserved successfully");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
