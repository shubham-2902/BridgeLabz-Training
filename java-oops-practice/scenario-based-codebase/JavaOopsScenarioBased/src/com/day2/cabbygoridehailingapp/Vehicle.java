package com.day2.cabbygoridehailingapp;

public abstract class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare;   // sensitive data

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    protected void setFare(double fare) {
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public abstract double getRatePerKm();
}
