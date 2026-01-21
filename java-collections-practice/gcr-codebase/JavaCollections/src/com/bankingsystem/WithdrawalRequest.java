package com.bankingsystem;
public class WithdrawalRequest {
    private String accountNumber;
    private double amount;

    public WithdrawalRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return "Request{account=" + accountNumber + ", amount=₹" + amount + "}";
    }
}
