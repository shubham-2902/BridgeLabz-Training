package com.generics.dynamiconlinemarketplace;
public enum BookCategory implements Category {
    FICTION,
    EDUCATION,
    COMICS,
    BIOGRAPHY;

    @Override
    public String getCategoryName() {
        return "BookCategory";
    }
}
