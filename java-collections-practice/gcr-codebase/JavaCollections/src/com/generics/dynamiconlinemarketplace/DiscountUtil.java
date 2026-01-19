package com.generics.dynamiconlinemarketplace;
public final class DiscountUtil {

    private DiscountUtil() {
    }

    // Generic method: accepts any Product of any category type
    public static <P extends Product<?>> void applyDiscount(P product, double percentage) {

        if (percentage <= 0 || percentage > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100.");
        }

        double oldPrice = product.getPrice();
        double newPrice = oldPrice - (oldPrice * (percentage / 100.0));

        product.setPrice(newPrice);
    }
}
