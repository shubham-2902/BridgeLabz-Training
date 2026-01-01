package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200; // lower insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance: Bike policy (secured)");
    }
}
