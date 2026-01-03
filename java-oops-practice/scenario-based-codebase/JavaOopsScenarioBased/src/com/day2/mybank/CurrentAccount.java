package com.day2.mybank;

public class CurrentAccount extends Account {

    private final double interestRate = 1.0;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalanceInternal() * interestRate / 100;
    }
}
