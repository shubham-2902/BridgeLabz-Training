package com.day9.ecommerceinventory;

public class Product {
    private int sku;
    private String name;
    private double price;
    private int stock;

    public Product(int sku, String name, double price, int stock) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getSku() {
        return sku;
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

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setStock(int newStock) {
        this.stock = newStock;
    }

    @Override
    public String toString() {
        return "SKU=" + sku + ", Name=" + name + ", Price=" + price + ", Stock=" + stock;
    }
}
