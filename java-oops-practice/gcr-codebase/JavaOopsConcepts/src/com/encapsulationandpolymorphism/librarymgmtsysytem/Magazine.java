package com.encapsulationandpolymorphism.librarymgmtsysytem;

public class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrowerName(borrowerName);
            available = false;
            System.out.println("Magazine reserved successfully");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
