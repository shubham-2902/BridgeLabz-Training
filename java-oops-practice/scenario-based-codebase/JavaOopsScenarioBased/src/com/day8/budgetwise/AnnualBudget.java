package com.day8.budgetwise;
public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📆 Annual Report");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + totalExpenses());
        System.out.println("Annual Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Overspend check for annual budget:");
        for (int i = 0; i < categories.length; i++) {
            double spent = getCategoryExpense(categories[i]);
            if (spent > categoryLimits[i]) {
                System.out.println("⚠ Overspend in " + categories[i] + " : " + spent);
            }
        }
    }
}
