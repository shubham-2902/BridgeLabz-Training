package com.generics.dynamiconlinemarketplace;
import java.util.Scanner;

public class MarketplaceApp {

    private static final PriceRange BOOK_RANGE = new PriceRange(50, 2000);
    private static final PriceRange CLOTHING_RANGE = new PriceRange(100, 10000);
    private static final PriceRange GADGET_RANGE = new PriceRange(500, 200000);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalog catalog = new Catalog();

        while (true) {
            System.out.println("\n===== DYNAMIC ONLINE MARKETPLACE =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Catalog");
            System.out.println("3. Apply Discount");
            System.out.println("4. Find Product by ID");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    addProduct(sc, catalog);
                    break;

                case 2:
                    viewCatalog(catalog);
                    break;

                case 3:
                    applyDiscount(sc, catalog);
                    break;

                case 4:
                    findProduct(sc, catalog);
                    break;

                case 5:
                    sc.close();
                    System.out.println("Exiting Marketplace.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addProduct(Scanner sc, Catalog catalog) {

        System.out.println("\nSelect Product Type:");
        System.out.println("1. Book");
        System.out.println("2. Clothing");
        System.out.println("3. Gadget");
        System.out.print("Enter type: ");

        int type = readInt(sc);

        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = readDouble(sc);

        try {
            if (type == 1) {
                BookCategory cat = chooseBookCategory(sc);
                Product<BookCategory> p = new Product<>(id, name, price, cat, BOOK_RANGE);
                catalog.addProduct(p);
                System.out.println("Book added successfully.");

            } else if (type == 2) {
                ClothingCategory cat = chooseClothingCategory(sc);
                Product<ClothingCategory> p = new Product<>(id, name, price, cat, CLOTHING_RANGE);
                catalog.addProduct(p);
                System.out.println("Clothing added successfully.");

            } else if (type == 3) {
                GadgetCategory cat = chooseGadgetCategory(sc);
                Product<GadgetCategory> p = new Product<>(id, name, price, cat, GADGET_RANGE);
                catalog.addProduct(p);
                System.out.println("Gadget added successfully.");

            } else {
                System.out.println("Invalid product type.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewCatalog(Catalog catalog) {
        if (catalog.getAllProducts().isEmpty()) {
            System.out.println("Catalog is empty.");
            return;
        }
        System.out.println("\n----- PRODUCT CATALOG -----");
        for (Product<? extends Category> p : catalog.getAllProducts()) {
            System.out.println(p);
        }
    }

    private static void applyDiscount(Scanner sc, Catalog catalog) {
        System.out.print("\nEnter Product ID: ");
        String id = sc.nextLine();

        Product<? extends Category> product = catalog.findById(id);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.print("Enter discount percentage: ");
        double pct = readDouble(sc);

        try {
            DiscountUtil.applyDiscount(product, pct);
            System.out.println("Discount applied. Updated product:");
            System.out.println(product);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void findProduct(Scanner sc, Catalog catalog) {
        System.out.print("\nEnter Product ID: ");
        String id = sc.nextLine();

        Product<? extends Category> product = catalog.findById(id);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.println("Found: " + product);
    }

    private static BookCategory chooseBookCategory(Scanner sc) {
        System.out.println("\nBook Categories:");
        BookCategory[] values = BookCategory.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println((i + 1) + ". " + values[i]);
        }
        System.out.print("Select category: ");
        int index = readInt(sc) - 1;

        if (index < 0 || index >= values.length) {
            throw new IllegalArgumentException("Invalid book category.");
        }
        return values[index];
    }

    private static ClothingCategory chooseClothingCategory(Scanner sc) {
        System.out.println("\nClothing Categories:");
        ClothingCategory[] values = ClothingCategory.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println((i + 1) + ". " + values[i]);
        }
        System.out.print("Select category: ");
        int index = readInt(sc) - 1;

        if (index < 0 || index >= values.length) {
            throw new IllegalArgumentException("Invalid clothing category.");
        }
        return values[index];
    }

    private static GadgetCategory chooseGadgetCategory(Scanner sc) {
        System.out.println("\nGadget Categories:");
        GadgetCategory[] values = GadgetCategory.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println((i + 1) + ". " + values[i]);
        }
        System.out.print("Select category: ");
        int index = readInt(sc) - 1;

        if (index < 0 || index >= values.length) {
            throw new IllegalArgumentException("Invalid gadget category.");
        }
        return values[index];
    }

    private static int readInt(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Enter again: ");
            }
        }
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine();
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Enter again: ");
            }
        }
    }
}
