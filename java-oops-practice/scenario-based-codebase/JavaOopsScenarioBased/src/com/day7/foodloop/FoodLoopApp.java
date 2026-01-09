package com.day7.foodloop;
import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to FoodLoop ===");

        // Sample menu items
        FoodItem paneer = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem dosa = new VegItem("Masala Dosa", 120, 5);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 300, 3);

        Order order = new Order();

        System.out.println("\nMenu:");
        System.out.println("1. Paneer Butter Masala (Veg)");
        System.out.println("2. Masala Dosa (Veg)");
        System.out.println("3. Chicken Biryani (Non-Veg)");

        System.out.print("How many items do you want to order? ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Select item number: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> order.addItem(paneer);
                case 2 -> order.addItem(dosa);
                case 3 -> order.addItem(chicken);
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("\n1. Place Order");
        System.out.println("2. Cancel Order");
        int action = sc.nextInt();

        if (action == 1) {
            order.placeOrder();
        } else {
            order.cancelOrder();
        }

        sc.close();
    }
}
