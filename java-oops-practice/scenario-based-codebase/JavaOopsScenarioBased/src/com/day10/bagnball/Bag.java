package com.day10.bagnball;
import java.util.ArrayList;

public class Bag implements Storable {
    private String id;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls; // Composition: Bag has balls

    // Constructor
    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Getters
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBallCount() {
        return balls.size();
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Add ball (with capacity check)
    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            return false; // bag is full
        }
        balls.add(ball);
        return true;
    }

    // Remove ball by ID
    public Ball removeBall(String ballId) {
        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i).getId().equalsIgnoreCase(ballId)) {
                return balls.remove(i);
            }
        }
        return null; // not found
    }

    // Display all balls
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in bag " + id);
            return;
        }

        System.out.println("Balls in bag " + id + ":");
        for (Ball ball : balls) {
            System.out.println("  " + ball);
        }
    }

    @Override
    public String toString() {
        return "Bag{ID='" + id + "', Color='" + color + "', Capacity=" + capacity +
                ", BallCount=" + balls.size() + "}";
    }
}
