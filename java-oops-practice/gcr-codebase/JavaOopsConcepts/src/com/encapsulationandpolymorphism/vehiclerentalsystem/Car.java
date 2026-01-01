package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance: Car policy (secured)");
    }
}
