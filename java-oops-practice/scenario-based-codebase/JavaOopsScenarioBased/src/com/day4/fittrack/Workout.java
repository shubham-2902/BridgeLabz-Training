package com.day4.fittrack;
public abstract class Workout implements ITrackable {

    protected int duration;        // minutes
    protected int caloriesBurned;

    public Workout(int duration) {
        this.duration = duration;
    }

    public abstract void calculateCalories(String intensity);

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println("🏁 Workout started...");
    }

    @Override
    public void stopWorkout() {
        System.out.println("🏁 Workout completed.");
    }
}
