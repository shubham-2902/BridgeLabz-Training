package com.day10.bagnball;
public class Ball implements Storable {
    private String id;
    private String color;
    private String size; // small / medium / large

    // Constructor
    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
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

    public String getSize() {
        return size;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Display
    @Override
    public String toString() {
        return "Ball{ID='" + id + "', Color='" + color + "', Size='" + size + "'}";
    }
}
