package com.constructors.level1;
import java.util.Scanner;
	public class Circle {

	    // Attribute
	    double radius;

	    // Default Constructor (chaining)
	    public Circle() {
	        this(1.0); // calls parameterized constructor
	    }

	    // Parameterized Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate area
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    // Main method
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Using default constructor
	        Circle c1 = new Circle();
	        System.out.println("Default Circle:");
	        System.out.println("Radius = " + c1.radius);
	        System.out.println("Area   = " + c1.calculateArea());

	        System.out.println();

	        // Taking user input
	        System.out.print("Enter radius for second circle: ");
	        double userRadius = sc.nextDouble();

	        // Using parameterized constructor
	        Circle c2 = new Circle(userRadius);
	        System.out.println("User Defined Circle:");
	        System.out.println("Radius = " + c2.radius);
	        System.out.println("Area   = " + c2.calculateArea());

	        sc.close();
	    }
	}



