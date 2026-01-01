package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days + 1000; // extra load charge
    }

    @Override
    public double calculateInsurance() {
        return 1000; // higher insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance: Truck policy (secured)");
    }
}
