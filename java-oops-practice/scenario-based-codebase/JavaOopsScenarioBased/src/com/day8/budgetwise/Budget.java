package com.day8.budgetwise;
import java.util.ArrayList;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected double[] categoryLimits;
    protected String[] categories;

    private ArrayList<Transaction> transactions = new ArrayList<>(); // hidden logs

    public Budget(double income, double limit, String[] categories, double[] categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
    }

    public void addTransaction(Transaction t) { // only method to add/edit expenses
        transactions.add(t);
    }

    protected double totalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Expense")) total += t.getAmount();
        }
        return total;
    }

    protected double netSavings() {
        return income - totalExpenses(); // operators
    }

    protected double getCategoryExpense(String cat) {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getCategory().equalsIgnoreCase(cat) && t.getType().equalsIgnoreCase("Expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }
}
