package com.day7.flashdealz;
public class FlashDealzApp {

    public static void main(String[] args) {
        Product[] products = {
                new Product("P01", "Smartphone", 35.0),
                new Product("P02", "Laptop", 25.0),
                new Product("P03", "Headphones", 60.0),
                new Product("P04", "Shoes", 45.0),
                new Product("P05", "Backpack", 30.0),
                new Product("P06", "Smartwatch", 55.0)
        };

        System.out.println("Before Sorting:");
        print(products);

        QuickSortByDiscount sorter = new QuickSortByDiscount();
        sorter.sort(products);

        System.out.println("\nAfter Sorting (Highest Discount First):");
        print(products);
    }

    private static void print(Product[] products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
