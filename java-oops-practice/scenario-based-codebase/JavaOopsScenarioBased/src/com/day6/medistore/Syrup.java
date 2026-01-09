package com.day6.medistore;
public class Syrup extends Medicine {

    public Syrup(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Syrup expiry check: Use before " + expiryDate);
    }

    @Override
    public void sell(int qty) {
        if (reduceStock(qty)) {
            calculateTotalCost(qty, 0.05); // 5% discount
            System.out.println("Syrup sold successfully.");
        } else {
            System.out.println("Insufficient stock.");
        }
    }
}
