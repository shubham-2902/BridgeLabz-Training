package com.day3.swiftcart;
import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice;   // sensitive

    // Empty cart
    public Cart() {
    }

    // Cart with pre-selected items
    public Cart(Product product) {
        addProduct(product);
    }

    public void addProduct(Product product) {
        products.add(product);
        updateTotal(product.getPrice());
    }

    // Only Cart can update price
    private void updateTotal(double amount) {
        totalPrice += amount;
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (Product p : products) {
            discount += p.getDiscount(totalPrice);
        }

        totalPrice = totalPrice - discount;
    }

    @Override
    public void generateBill() {
        System.out.println("Items in Cart: " + products.size());
        System.out.println("Total Amount Payable: Rs " + totalPrice);
    }
}
