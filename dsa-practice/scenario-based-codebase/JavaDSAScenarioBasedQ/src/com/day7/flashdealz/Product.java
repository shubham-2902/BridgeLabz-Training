package com.day7.flashdealz;
public class Product {
    private String id;
    private String name;
    private double discountPercent;

    public Product(String id, String name, double discountPercent) {
        this.id = id;
        this.name = name;
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + name + " -> " + discountPercent + "% off";
    }
}
