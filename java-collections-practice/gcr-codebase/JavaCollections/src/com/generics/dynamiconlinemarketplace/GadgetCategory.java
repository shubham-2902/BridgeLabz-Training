package com.generics.dynamiconlinemarketplace;
public enum GadgetCategory implements Category {
    MOBILE,
    LAPTOP,
    ACCESSORY;

    @Override
    public String getCategoryName() {
        return "GadgetCategory";
    }
}
