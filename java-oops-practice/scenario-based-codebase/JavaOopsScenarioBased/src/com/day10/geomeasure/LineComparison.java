package com.day10.geomeasure;

public class LineComparison {
    private Line line1;
    private Line line2;

    // store results
    private double length1;
    private double length2;
    private String result;

    public LineComparison(Line line1, Line line2) {
        // this keyword used
        this.line1 = line1;
        this.line2 = line2;

        // compute lengths
        this.length1 = line1.calculateLength();
        this.length2 = line2.calculateLength();

        // compare lengths
        this.result = compare();
    }

    private String compare() {
        double diff = Math.abs(length1 - length2);
        double tolerance = 0.0001; // avoids floating point issues

        if (diff <= tolerance) return "Both lines are equal in length";
        if (length1 > length2) return "Line 1 is longer";
        return "Line 2 is longer";
    }

    public void displayComparison() {
        System.out.println("\n--- Line Comparison ---");
        System.out.println("Line 1: " + line1);
        System.out.println("Length 1: " + length1);

        System.out.println("Line 2: " + line2);
        System.out.println("Length 2: " + length2);

        System.out.println("Result: " + result);
    }

    // getters if needed later
    public String getResult() { return result; }
}
