package com.day4.fittrack;
public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super(duration);
    }

    @Override
    public void calculateCalories(String intensity) {

        if (intensity.equalsIgnoreCase("High")) {
            caloriesBurned = duration * 8;
        } else {
            caloriesBurned = duration * 5;
        }
    }
}
