package com.day1.hospitalpatientmgmt;

public class Bill implements Payable {

    private double baseAmount;
    private double taxRate;
    private double discount;

    public Bill(double baseAmount, double taxRate, double discount) {
        this.baseAmount = baseAmount;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * taxRate;
        double total = baseAmount + tax - discount;
        return total;
    }
}
