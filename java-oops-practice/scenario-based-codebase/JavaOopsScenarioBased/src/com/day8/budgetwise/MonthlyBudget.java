package com.day8.budgetwise;
public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📅 Monthly Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Net Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        for (int i = 0; i < categories.length; i++) {
            double spent = getCategoryExpense(categories[i]);
            if (spent > categoryLimits[i]) {
                System.out.println("⚠ Overspend in " + categories[i] + " : " + spent);
            }
        }
    }
}
