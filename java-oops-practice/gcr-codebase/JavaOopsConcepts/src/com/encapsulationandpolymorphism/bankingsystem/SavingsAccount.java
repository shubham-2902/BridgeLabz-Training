package com.encapsulationandpolymorphism.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied under Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5; // 5x of balance
    }
}
