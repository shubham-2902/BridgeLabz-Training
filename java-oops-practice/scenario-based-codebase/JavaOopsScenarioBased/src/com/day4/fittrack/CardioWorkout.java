package com.day4.fittrack;
public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super(duration);
    }

    @Override
    public void calculateCalories(String intensity) {

        if (intensity.equalsIgnoreCase("High")) {
            caloriesBurned = duration * 10;
        } else {
            caloriesBurned = duration * 7;
        }
    }
}
