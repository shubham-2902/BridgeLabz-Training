package com.day2.cabbygoridehailingapp;

public class Driver {

    private String name;
    private String licenseNumber;
    private double rating;   // sensitive

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
}
