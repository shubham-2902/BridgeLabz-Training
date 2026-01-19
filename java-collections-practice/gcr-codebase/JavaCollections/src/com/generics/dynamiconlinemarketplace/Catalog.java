package com.generics.dynamiconlinemarketplace;
import java.util.ArrayList;
import java.util.List;

public class Catalog {

    // Heterogeneous catalog: can store Product<BookCategory>, Product<ClothingCategory>, etc.
    private final List<Product<? extends Category>> products;

    public Catalog() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public Product<? extends Category> findById(String id) {
        for (Product<? extends Category> p : products) {
            if (p.getProductId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Product<? extends Category>> getAllProducts() {
        return products;
    }
}
