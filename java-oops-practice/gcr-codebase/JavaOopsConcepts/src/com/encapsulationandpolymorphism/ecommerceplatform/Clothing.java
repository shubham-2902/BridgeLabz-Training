package com.encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax: 12% GST on Clothing");
    }
}
