package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class ECommerceApp {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        calculateFinalPrice(products);
    }

    // Polymorphic method
    public static void calculateFinalPrice(List<Product> products) {

        for (Product product : products) {

            product.displayProduct();

            double tax = 0;
            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
                taxable.getTaxDetails();
            }

            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount   : " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------");
        }
    }
}
