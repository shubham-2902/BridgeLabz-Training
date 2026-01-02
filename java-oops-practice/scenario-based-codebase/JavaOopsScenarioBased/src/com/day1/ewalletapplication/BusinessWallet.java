package com.day1.ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.05;

    public BusinessWallet(User owner) {
        super(owner);
    }

    public BusinessWallet(User owner, double referralBonus) {
        super(owner, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (deductBalance(totalDeduction)) {
            System.out.println("₹" + amount + " transferred from "
                    + owner.getName() + " to " + receiver.getName());
            System.out.println("Tax Deducted: ₹" + tax);
        } else {
            System.out.println("Insufficient balance (including tax).");
        }
    }
}
