package com.day3.swiftcart;
public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double getDiscount(double total) {
        // 10% discount on perishables
        return total * 0.10;
    }
}
