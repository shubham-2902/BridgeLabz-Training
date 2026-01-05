package com.day3.swiftcart;
public class SwiftCartMain {

    public static void main(String[] args) {

        // Products
        Product milk = new PerishableProduct("Milk", 60);
        Product rice = new NonPerishableProduct("Rice", 500);
        Product fruits = new PerishableProduct("Fruits", 120);

        // Cart
        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(rice);
        cart.addProduct(fruits);

        // Checkout
        cart.applyDiscount();
        cart.generateBill();
    }
}
