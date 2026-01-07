package com.day5.loadbuddy;
public class Applicant {

    private String name;
    private int creditScore;     // sensitive
    private double income;
    private double loanAmount;

    public Applicant(String name, int creditScore,
                     double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    // Controlled access
    public int getCreditScore() {
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public String getName() {
        return name;
    }
}
