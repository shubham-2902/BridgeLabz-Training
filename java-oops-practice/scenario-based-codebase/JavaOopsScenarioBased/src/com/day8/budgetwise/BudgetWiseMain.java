package com.day8.budgetwise;
import java.util.Scanner;

public class BudgetWiseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Budget Type:");
        System.out.println("1. Monthly\n2. Annual");
        int choice = sc.nextInt();

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Budget Limit: ");
        double limit = sc.nextDouble();
        sc.nextLine();

        String[] categories = {"Food", "Travel", "Shopping"};
        double[] limits = {3000, 2000, 1500};

        Budget budget = (choice == 1)
                ? new MonthlyBudget(income, limit, categories, limits)
                : new AnnualBudget(income, limit, categories, limits);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nTransaction " + (i + 1));
            System.out.print("Type (Income/Expense): ");
            String type = sc.nextLine();

            System.out.print("Amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();

            System.out.print("Date: ");
            String date = sc.nextLine();

            System.out.print("Category: ");
            String cat = sc.nextLine();

            budget.addTransaction(new Transaction(amt, type, date, cat));
        }

        System.out.println("\n--- Report ---");
        budget.generateReport();
        budget.detectOverspend();

        sc.close();
    }
}
