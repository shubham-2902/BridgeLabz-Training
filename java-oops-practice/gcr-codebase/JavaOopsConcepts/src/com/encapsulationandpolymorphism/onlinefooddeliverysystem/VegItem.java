package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: 10% on Veg Items");
    }
}
