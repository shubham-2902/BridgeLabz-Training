package com.day7.foodloop;
import java.util.ArrayList;

public class Order implements IOrderable {

    private ArrayList<FoodItem> items = new ArrayList<>();
    private double total;
    private String status;

    public Order() {
        status = "CREATED";
    }

    // Combo meal constructor
    public Order(FoodItem item1, FoodItem item2) {
        this();
        addItem(item1);
        addItem(item2);
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable() && item.reduceStock()) {
            items.add(item);
            total += item.getPrice();
        } else {
            System.out.println(item.name + " is out of stock.");
        }
    }

    // Polymorphic discount logic based on order total
    private double applyDiscount() {
        if (total >= 500) {
            return total * 0.20; // 20% discount
        } else if (total >= 300) {
            return total * 0.10; // 10% discount
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        double discount = applyDiscount();
        total = total - discount;
        status = "CONFIRMED";

        System.out.println("\n--- Order Summary ---");
        System.out.println("Items Ordered: " + items.size());
        System.out.println("Discount Applied: Rs " + discount);
        System.out.println("Total Payable: Rs " + total);
        System.out.println("Order Status: " + status);
    }

    @Override
    public void cancelOrder() {
        status = "CANCELLED";
        System.out.println("Order cancelled.");
    }
}
