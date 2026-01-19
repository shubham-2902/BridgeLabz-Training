package com.generics.dynamiconlinemarketplace;
public final class PriceRange {

    private final double min;
    private final double max;

    public PriceRange(double min, double max) {
        if (min < 0 || max < 0 || min > max) {
            throw new IllegalArgumentException("Invalid price range.");
        }
        this.min = min;
        this.max = max;
    }

    public boolean isValid(double price) {
        return price >= min && price <= max;
    }

    @Override
    public String toString() {
        return "[" + min + " - " + max + "]";
    }
}
