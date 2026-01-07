package com.day5.loadbuddy;
import java.util.Scanner;

public class LoanBuddyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Applicant Details ----------
        System.out.println("=== LoanBuddy : Applicant Details ===");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant =
                new Applicant(name, creditScore, income, loanAmount);

        // ---------- Loan Type ----------
        System.out.println("\nSelect Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.println("3. Personal Loan");
        int choice = sc.nextInt();

        System.out.print("Tenure (months): ");
        int tenure = sc.nextInt();

        LoanApplication loan;

        if (choice == 1) {
            loan = new HomeLoan(applicant, tenure);
        } else if (choice == 2) {
            loan = new AutoLoan(applicant, tenure);
        } else {
            loan = new PersonalLoan(applicant, tenure);
        }

        // ---------- Approval ----------
        System.out.println("\n=== Loan Evaluation ===");

        if (loan.approveLoan()) {
            double emi = loan.calculateEMI();
            System.out.println(" Loan Approved!");
            System.out.println("Applicant: " + applicant.getName());
            System.out.println("Monthly EMI: Rs " + Math.round(emi));
        } else {
            System.out.println(" Loan Rejected because you do not meet the eligibility criteria.");
        }

        sc.close();
    }
}
