package com.generics.personalizedmealplan;
public class KetoMeal implements MealPlan {

    private int calories;
    private int mealsPerDay;
    private int maxCarbsGrams;

    public KetoMeal(int calories, int mealsPerDay, int maxCarbsGrams) {
        this.calories = calories;
        this.mealsPerDay = mealsPerDay;
        this.maxCarbsGrams = maxCarbsGrams;
    }

    @Override
    public String getCategory() {
        return "Keto";
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getMealsPerDay() {
        return mealsPerDay;
    }

    public int getMaxCarbsGrams() {
        return maxCarbsGrams;
    }

    @Override
    public String getPlanDetails() {
        return "Calories=" + calories +
                ", MealsPerDay=" + mealsPerDay +
                ", MaxCarbs=" + maxCarbsGrams + "g";
    }

    @Override
    public String toString() {
        return getCategory() + "Meal{" + getPlanDetails() + "}";
    }
}
