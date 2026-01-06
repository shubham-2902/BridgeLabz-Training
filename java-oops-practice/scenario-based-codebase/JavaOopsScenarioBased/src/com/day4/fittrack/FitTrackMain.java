package com.day4.fittrack;
import java.util.Scanner;

public class FitTrackMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- User Details ----------
        System.out.println("=== User Profile ===");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Daily Calorie Target: ");
        int target = sc.nextInt();
        sc.nextLine();

        UserProfile user = new UserProfile(name, age, weight, target);

        // ---------- Workout Questions ----------
        System.out.println("\n=== Workout Selection ===");
        System.out.println("1. Cardio Workout");
        System.out.println("2. Strength Workout");
        System.out.print("Choose Workout Type: ");
        int choice = sc.nextInt();

        System.out.print("Enter Workout Duration (minutes): ");
        int duration = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Intensity (Low / High): ");
        String intensity = sc.nextLine();

        Workout workout;

        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        // ---------- Workout Flow ----------
        workout.startWorkout();
        workout.calculateCalories(intensity);
        workout.stopWorkout();

        // ---------- Progress ----------
        int remaining =
                user.getDailyTarget() - workout.getCaloriesBurned();

        System.out.println("\n📊 Fitness Summary for " + user.getName());
        System.out.println("Calories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Daily Target: " + remaining);

        sc.close();
    }
}
