package com.generics.dynamiconlinemarketplace;
public enum ClothingCategory implements Category {
    MEN,
    WOMEN,
    KIDS;

    @Override
    public String getCategoryName() {
        return "ClothingCategory";
    }
}
