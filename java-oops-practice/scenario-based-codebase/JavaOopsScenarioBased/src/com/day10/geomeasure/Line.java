package com.day10.geomeasure;

public class Line {
    // Encapsulation: fields are private (hidden from outside world)
    private double x1, y1, x2, y2;

    // Constructor: initialize object at creation time
    public Line(double x1, double y1, double x2, double y2) {
        // this keyword refers to current object
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length
    public double calculateLength() {
        double dx = this.x2 - this.x1;
        double dy = this.y2 - this.y1;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    // Getters (optional but shows encapsulation properly)
    public double getX1() { return x1; }
    public double getY1() { return y1; }
    public double getX2() { return x2; }
    public double getY2() { return y2; }

    // Convert line info to readable format
    @Override
    public String toString() {
        return "(" + x1 + ", " + y1 + ") -> (" + x2 + ", " + y2 + ")";
    }
}
