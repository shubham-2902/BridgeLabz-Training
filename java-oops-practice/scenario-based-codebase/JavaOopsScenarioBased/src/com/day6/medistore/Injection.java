package com.day6.medistore;
public class Injection extends Medicine {

    public Injection(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Injection expiry check: Refrigerated till " + expiryDate);
    }

    @Override
    public void sell(int qty) {
        if (reduceStock(qty)) {
            calculateTotalCost(qty, 0.0); // no discount
            System.out.println("Injection sold successfully.");
        } else {
            System.out.println("Insufficient stock.");
        }
    }
}
