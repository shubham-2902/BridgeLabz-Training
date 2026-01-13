package com.day3.smartcheckout;
import java.util.HashMap;

public class Customer {
    private String customerName;

    // itemName -> quantity
    private HashMap<String, Integer> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new HashMap<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public HashMap<String, Integer> getCart() {
        return cart;
    }

    public void addItem(String itemName, int qty) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + qty);
    }
}
