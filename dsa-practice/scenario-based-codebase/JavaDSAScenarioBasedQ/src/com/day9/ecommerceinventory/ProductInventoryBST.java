package com.day9.ecommerceinventory;

public class ProductInventoryBST {
    private ProductNode root;

    // Scenario 1 + Insert support
    public void insert(Product product) {
        root = insertRec(root, product);
    }

    private ProductNode insertRec(ProductNode root, Product product) {
        if (root == null) return new ProductNode(product);

        int sku = product.getSku();
        int rootSku = root.product.getSku();

        if (sku < rootSku) root.left = insertRec(root.left, product);
        else if (sku > rootSku) root.right = insertRec(root.right, product);
        else System.out.println("Duplicate SKU not allowed: " + sku);

        return root;
    }

    // Scenario 1: Lookup using SKU
    public Product search(int sku) {
        ProductNode node = searchRec(root, sku);
        return node == null ? null : node.product;
    }

    private ProductNode searchRec(ProductNode root, int sku) {
        if (root == null) return null;

        int rootSku = root.product.getSku();
        if (sku == rootSku) return root;
        if (sku < rootSku) return searchRec(root.left, sku);
        return searchRec(root.right, sku);
    }

    // Scenario 2: Price update using SKU key
    public boolean updatePrice(int sku, double newPrice) {
        ProductNode node = searchRec(root, sku);
        if (node == null) return false;

        node.product.setPrice(newPrice);
        return true;
    }

    // Scenario 3: Sorted list in SKU order
    public void displayAllSortedBySKU() {
        if (root == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Products Sorted by SKU:");
        inorder(root);
    }

    private void inorder(ProductNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.product);
        inorder(root.right);
    }
}
