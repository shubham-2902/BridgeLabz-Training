package com.day1.ewalletapplication;

public class EWalletApp {

    public static void main(String[] args) {

        // Users
        User user1 = new User(1, "Rahul");
        User user2 = new User(2, "Anita");

        // Wallets
        Wallet personalWallet = new PersonalWallet(user1, 500); // referral bonus
        Wallet businessWallet = new BusinessWallet(user2);

        // Load money
        personalWallet.loadMoney(3000);
        businessWallet.loadMoney(10000);

        System.out.println("--- Initial Balances ---");
        System.out.println("Rahul Balance: ₹" + personalWallet.getBalance());
        System.out.println("Anita Balance: ₹" + businessWallet.getBalance());

        // Polymorphic transfer
        personalWallet.transferTo(user2, 2000);
        businessWallet.transferTo(user1, 4000);

        System.out.println("\n--- Final Balances ---");
        System.out.println("Rahul Balance: ₹" + personalWallet.getBalance());
        System.out.println("Anita Balance: ₹" + businessWallet.getBalance());
    }
}
