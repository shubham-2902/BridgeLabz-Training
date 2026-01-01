package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50; // hygiene / handling

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: 5% on Non-Veg Items");
    }
}
