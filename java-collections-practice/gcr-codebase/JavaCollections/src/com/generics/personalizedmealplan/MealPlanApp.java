package com.generics.personalizedmealplan;
import java.util.Scanner;

public class MealPlanApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        while (true) {
            System.out.println("\n===== PERSONALIZED MEAL PLAN GENERATOR =====");
            System.out.println("1. Vegetarian");
            System.out.println("2. Vegan");
            System.out.println("3. Keto");
            System.out.println("4. High-Protein");
            System.out.println("5. Exit");
            System.out.print("Choose meal category: ");

            int choice = readInt(sc);

            try {
                if (choice == 1) {
                    Meal<VegetarianMeal> meal = handleVegetarian(sc, userName);
                    System.out.println("Generated Meal Plan:");
                    System.out.println(meal);

                } else if (choice == 2) {
                    Meal<VeganMeal> meal = handleVegan(sc, userName);
                    System.out.println("Generated Meal Plan:");
                    System.out.println(meal);

                } else if (choice == 3) {
                    Meal<KetoMeal> meal = handleKeto(sc, userName);
                    System.out.println("Generated Meal Plan:");
                    System.out.println(meal);

                } else if (choice == 4) {
                    Meal<HighProteinMeal> meal = handleHighProtein(sc, userName);
                    System.out.println("Generated Meal Plan:");
                    System.out.println(meal);

                } else if (choice == 5) {
                    sc.close();
                    System.out.println("Exiting Meal Plan Generator.");
                    return;

                } else {
                    System.out.println("Invalid choice.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Validation Error: " + e.getMessage());
            }
        }
    }

    private static Meal<VegetarianMeal> handleVegetarian(Scanner sc, String userName) {
        System.out.print("Enter calories (800-4500): ");
        int calories = readInt(sc);

        System.out.print("Enter meals per day (1-8): ");
        int meals = readInt(sc);

        System.out.print("Includes dairy? (true/false): ");
        boolean dairy = readBoolean(sc);

        VegetarianMeal plan = new VegetarianMeal(calories, meals, dairy);
        return MealPlanUtil.generateMeal(userName, plan);
    }

    private static Meal<VeganMeal> handleVegan(Scanner sc, String userName) {
        System.out.print("Enter calories (800-4500): ");
        int calories = readInt(sc);

        System.out.print("Enter meals per day (1-8): ");
        int meals = readInt(sc);

        VeganMeal plan = new VeganMeal(calories, meals);
        return MealPlanUtil.generateMeal(userName, plan);
    }

    private static Meal<KetoMeal> handleKeto(Scanner sc, String userName) {
        System.out.print("Enter calories (800-4500): ");
        int calories = readInt(sc);

        System.out.print("Enter meals per day (1-8): ");
        int meals = readInt(sc);

        System.out.print("Enter max carbs grams (<=50): ");
        int carbs = readInt(sc);

        KetoMeal plan = new KetoMeal(calories, meals, carbs);
        return MealPlanUtil.generateMeal(userName, plan);
    }

    private static Meal<HighProteinMeal> handleHighProtein(Scanner sc, String userName) {
        System.out.print("Enter calories (800-4500): ");
        int calories = readInt(sc);

        System.out.print("Enter meals per day (1-8): ");
        int meals = readInt(sc);

        System.out.print("Enter minimum protein grams (>=80): ");
        int protein = readInt(sc);

        HighProteinMeal plan = new HighProteinMeal(calories, meals, protein);
        return MealPlanUtil.generateMeal(userName, plan);
    }

    private static int readInt(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Enter again: ");
            }
        }
    }

    private static boolean readBoolean(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("true")) return true;
            if (s.equals("false")) return false;
            System.out.print("Invalid input. Enter true/false: ");
        }
    }
}
