package com.day3.swiftcart;
public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double getDiscount(double total) {
        // Flat discount
        return 50;
    }
}
