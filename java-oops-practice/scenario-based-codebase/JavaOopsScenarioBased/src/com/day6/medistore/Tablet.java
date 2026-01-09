package com.day6.medistore;
public class Tablet extends Medicine {

    public Tablet(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Tablet expiry check: Stable till " + expiryDate);
    }

    @Override
    public void sell(int qty) {
        if (reduceStock(qty)) {
            calculateTotalCost(qty, 0.10); // 10% discount
            System.out.println("Tablet sold successfully.");
        } else {
            System.out.println("Insufficient stock.");
        }
    }
}
