package com.generics.dynamiconlinemarketplace;
public class Product<T extends Category> {

    private String productId;
    private String name;
    private double price;
    private T category;
    private PriceRange allowedRange;

    public Product(String productId, String name, double price, T category, PriceRange allowedRange) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.allowedRange = allowedRange;

        validatePrice(price);
    }

    private void validatePrice(double price) {
        if (!allowedRange.isValid(price)) {
            throw new IllegalArgumentException(
                    "Price " + price + " is not allowed for this product type. Allowed range: " + allowedRange
            );
        }
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{ID=" + productId +
                ", Name=" + name +
                ", Price=" + price +
                ", CategoryType=" + category.getCategoryName() +
                ", Category=" + category +
                ", AllowedRange=" + allowedRange +
                "}";
    }
}
