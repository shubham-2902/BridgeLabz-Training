package com.generics.personalizedmealplan;
public class HighProteinMeal implements MealPlan {

    private int calories;
    private int mealsPerDay;
    private int minProteinGrams;

    public HighProteinMeal(int calories, int mealsPerDay, int minProteinGrams) {
        this.calories = calories;
        this.mealsPerDay = mealsPerDay;
        this.minProteinGrams = minProteinGrams;
    }

    @Override
    public String getCategory() {
        return "High-Protein";
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getMealsPerDay() {
        return mealsPerDay;
    }

    public int getMinProteinGrams() {
        return minProteinGrams;
    }

    @Override
    public String getPlanDetails() {
        return "Calories=" + calories +
                ", MealsPerDay=" + mealsPerDay +
                ", MinProtein=" + minProteinGrams + "g";
    }

    @Override
    public String toString() {
        return getCategory() + "Meal{" + getPlanDetails() + "}";
    }
}
