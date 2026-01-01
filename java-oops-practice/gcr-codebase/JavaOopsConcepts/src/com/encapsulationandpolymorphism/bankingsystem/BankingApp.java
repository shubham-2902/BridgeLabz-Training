package com.encapsulationandpolymorphism.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingApp {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Rohit", 50000));
        accounts.add(new CurrentAccount("CA201", "Neha", 80000));

        for (BankAccount account : accounts) {

            account.displayAccountDetails();

            account.deposit(5000);
            account.withdraw(2000);

            double interest = account.calculateInterest();
            System.out.println("Interest Earned: " + interest);

            if (account instanceof Loanable) {
                Loanable loan = (Loanable) account;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
            }

            System.out.println("--------------------------------");
        }
    }
}
