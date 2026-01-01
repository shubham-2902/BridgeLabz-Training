package com.encapsulationandpolymorphism.ecommerceplatform;

public class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax: 18% GST on Electronics");
    }
}
