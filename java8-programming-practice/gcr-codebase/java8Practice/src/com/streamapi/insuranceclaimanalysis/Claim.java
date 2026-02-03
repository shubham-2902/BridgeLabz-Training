package com.streamapi.insuranceclaimanalysis;
public class Claim {
    private String claimType;
    private double amount;

    public Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() { return claimType; }
    public double getAmount() { return amount; }
}
