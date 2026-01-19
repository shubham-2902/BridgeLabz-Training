package com.generics.personalizedmealplan;
public class VegetarianMeal implements MealPlan {

    private int calories;
    private int mealsPerDay;
    private boolean includesDairy;

    public VegetarianMeal(int calories, int mealsPerDay, boolean includesDairy) {
        this.calories = calories;
        this.mealsPerDay = mealsPerDay;
        this.includesDairy = includesDairy;
    }

    @Override
    public String getCategory() {
        return "Vegetarian";
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getMealsPerDay() {
        return mealsPerDay;
    }

    public boolean isIncludesDairy() {
        return includesDairy;
    }

    @Override
    public String getPlanDetails() {
        return "Calories=" + calories +
                ", MealsPerDay=" + mealsPerDay +
                ", IncludesDairy=" + includesDairy;
    }

    @Override
    public String toString() {
        return getCategory() + "Meal{" + getPlanDetails() + "}";
    }
}
