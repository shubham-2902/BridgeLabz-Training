package com.day1.ewalletapplication;

public class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    public PersonalWallet(User owner) {
        super(owner);
    }

    public PersonalWallet(User owner, double referralBonus) {
        super(owner, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer exceeds personal wallet limit.");
            return;
        }

        if (deductBalance(amount)) {
            System.out.println("₹" + amount + " transferred from "
                    + owner.getName() + " to " + receiver.getName());
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
