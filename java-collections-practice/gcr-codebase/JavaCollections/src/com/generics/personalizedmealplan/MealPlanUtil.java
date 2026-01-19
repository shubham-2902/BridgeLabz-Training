package com.generics.personalizedmealplan;
public final class MealPlanUtil {

    private MealPlanUtil() {
    }

    // Generic validation method: works for any type of MealPlan
    public static <T extends MealPlan> void validatePlan(T plan) {

        if (plan.getCalories() < 800 || plan.getCalories() > 4500) {
            throw new IllegalArgumentException("Calories must be between 800 and 4500.");
        }

        if (plan.getMealsPerDay() < 1 || plan.getMealsPerDay() > 8) {
            throw new IllegalArgumentException("Meals per day must be between 1 and 8.");
        }

        // Category-specific validation using runtime type checks
        if (plan instanceof KetoMeal) {
            KetoMeal keto = (KetoMeal) plan;
            if (keto.getMaxCarbsGrams() > 50) {
                throw new IllegalArgumentException("Keto plan max carbs must be <= 50g.");
            }
        }

        if (plan instanceof HighProteinMeal) {
            HighProteinMeal hp = (HighProteinMeal) plan;
            if (hp.getMinProteinGrams() < 80) {
                throw new IllegalArgumentException("High-Protein plan minimum protein must be >= 80g.");
            }
        }
    }

    // Generic generator: returns type-safe Meal<T>
    public static <T extends MealPlan> Meal<T> generateMeal(String userName, T plan) {
        validatePlan(plan);
        return new Meal<>(userName, plan);
    }
}
