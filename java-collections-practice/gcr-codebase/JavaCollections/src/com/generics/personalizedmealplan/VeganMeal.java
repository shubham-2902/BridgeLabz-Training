package com.generics.personalizedmealplan;
public class VeganMeal implements MealPlan {

    private int calories;
    private int mealsPerDay;

    public VeganMeal(int calories, int mealsPerDay) {
        this.calories = calories;
        this.mealsPerDay = mealsPerDay;
    }

    @Override
    public String getCategory() {
        return "Vegan";
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getMealsPerDay() {
        return mealsPerDay;
    }

    @Override
    public String getPlanDetails() {
        return "Calories=" + calories +
                ", MealsPerDay=" + mealsPerDay +
                ", NoAnimalProducts=true";
    }

    @Override
    public String toString() {
        return getCategory() + "Meal{" + getPlanDetails() + "}";
    }
}
