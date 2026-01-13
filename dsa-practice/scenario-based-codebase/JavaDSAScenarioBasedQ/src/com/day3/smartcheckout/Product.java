package com.day3.smartcheckout;
public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int qty) {
        stock -= qty;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Stock: " + stock;
    }
}
