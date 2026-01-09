package com.day7.foodloop;
public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;

    private int stock;          // hidden stock
    private boolean available;

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.available = true;
    }

    // Encapsulated stock handling
    public boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        available = false;
        return false;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getPrice() {
        return price;
    }
}
