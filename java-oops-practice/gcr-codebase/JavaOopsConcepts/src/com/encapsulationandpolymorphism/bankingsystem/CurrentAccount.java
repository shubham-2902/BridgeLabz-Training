package com.encapsulationandpolymorphism.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01; // 1% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied under Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 3; // 3x of balance
    }
}
