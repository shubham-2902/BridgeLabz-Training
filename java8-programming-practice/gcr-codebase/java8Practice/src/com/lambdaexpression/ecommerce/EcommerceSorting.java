package com.lambdaexpression.ecommerce;
import java.util.*;

public class EcommerceSorting {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 70000, 4.5, 10),
                new Product("Phone", 30000, 4.7, 15),
                new Product("Tablet", 25000, 4.2, 20)
        );

        // Sorting by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price: " + products);

        // Sorting by rating -> highest first
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("Sorted by Rating: " + products);

        // Sorting by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("Sorted by Discount: " + products);
    }
}
