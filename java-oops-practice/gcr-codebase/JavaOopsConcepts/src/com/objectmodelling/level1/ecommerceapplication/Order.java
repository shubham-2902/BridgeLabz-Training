package com.objectmodelling.level1.ecommerceapplication;
import java.util.ArrayList;
import java.util.List;

 public class Order {

    private int orderId;
    private List<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        double total = 0;
        System.out.println("Order ID: " + orderId);

        for (Product p : products) {
            System.out.println("  - " + p.getProductName());
            total += p.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}


