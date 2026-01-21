package com.shoppingcart;
import java.util.*;

public class ShoppingCartApp {

    // productName -> price (quick lookup)
    private HashMap<String, Double> priceMap = new HashMap<>();

    // cart maintains order of items added (productName -> quantity)
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    public ShoppingCartApp() {
        // Pre-load some products (you can also take these as input if needed)
        priceMap.put("Milk", 55.0);
        priceMap.put("Bread", 40.0);
        priceMap.put("Rice", 70.0);
        priceMap.put("Apple", 120.0);
        priceMap.put("Sugar", 45.0);
    }

    public void addToCart(String productName, int qty) {
        if (!priceMap.containsKey(productName)) {
            System.out.println("Product not found!");
            return;
        }
        cart.put(productName, cart.getOrDefault(productName, 0) + qty);
        System.out.println("Added " + qty + " " + productName + "(s) to cart.");
    }

    public void displayCartInOrder() {
        System.out.println("\n--- Cart Items (LinkedHashMap: Insertion Order) ---");
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;
        for (Map.Entry<String, Integer> e : cart.entrySet()) {
            String product = e.getKey();
            int qty = e.getValue();
            double price = priceMap.get(product);
            double cost = qty * price;
            total += cost;

            System.out.println(product + " -> Qty: " + qty + ", Price: ₹" + price + ", Cost: ₹" + cost);
        }
        System.out.println("TOTAL: ₹" + total);
    }

    // TreeMap used to display items sorted by price
    public void displayItemsSortedByPrice() {
        System.out.println("\n--- Items Sorted By Price (TreeMap) ---");

        // Key = price, Value = list of product names (handle duplicate prices)
        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

        for (String product : priceMap.keySet()) {
            double price = priceMap.get(product);
            sortedByPrice.putIfAbsent(price, new ArrayList<>());
            sortedByPrice.get(price).add(product);
        }

        for (Map.Entry<Double, List<String>> e : sortedByPrice.entrySet()) {
            System.out.println("₹" + e.getKey() + " -> " + e.getValue());
        }
    }

    public void displayProducts() {
        System.out.println("\n--- Available Products (HashMap) ---");
        for (Map.Entry<String, Double> e : priceMap.entrySet()) {
            System.out.println(e.getKey() + " -> ₹" + e.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCartApp app = new ShoppingCartApp();

        while (true) {
            System.out.println("\n================= SHOPPING CART MENU =================");
            System.out.println("1. Show Available Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart (Insertion Order)");
            System.out.println("4. View Products Sorted by Price");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int ch;
            try {
                ch = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (ch) {
                case 1:
                    app.displayProducts();
                    break;

                case 2:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine().trim();

                    System.out.print("Enter quantity: ");
                    int qty;
                    try {
                        qty = Integer.parseInt(sc.nextLine());
                        if (qty <= 0) throw new RuntimeException();
                    } catch (Exception ex) {
                        System.out.println("Quantity must be positive.");
                        break;
                    }

                    app.addToCart(name, qty);
                    break;

                case 3:
                    app.displayCartInOrder();
                    break;

                case 4:
                    app.displayItemsSortedByPrice();
                    break;

                case 0:
                    System.out.println("Exiting Shopping Cart...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
