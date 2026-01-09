package com.day6.medistore;
public abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected String expiryDate;

    private int quantity;          // stock hidden
    private double totalCost;      // sensitive pricing logic

    // Constructor with default quantity
    public Medicine(String name, double price, String expiryDate) {
        this(name, price, expiryDate, 50);
    }

    public Medicine(String name, double price, String expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected boolean reduceStock(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    protected void calculateTotalCost(int qty, double discountRate) {
        totalCost = (price * qty) - (price * qty * discountRate);
    }

    public void showBill() {
        System.out.println("Medicine: " + name);
        System.out.println("Total Cost: Rs " + totalCost);
        System.out.println("Remaining Stock: " + quantity);
    }
}
