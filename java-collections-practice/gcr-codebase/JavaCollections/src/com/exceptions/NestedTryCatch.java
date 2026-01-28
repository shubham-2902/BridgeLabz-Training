package com.exceptions;

import java.util.Scanner;

public class NestedTryCatch {
	

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Taking array input
	            System.out.print("Enter array size: ");
	            int size = scanner.nextInt();
	            int[] arr = new int[size];

	            System.out.println("Enter array elements:");
	            for (int i = 0; i < size; i++) {
	                arr[i] = scanner.nextInt();
	            }

	            // Outer try block for array index access
	            try {
	                System.out.print("Enter index to access: ");
	                int index = scanner.nextInt();

	                int value = arr[index];  // May cause ArrayIndexOutOfBoundsException

	                // Inner try block for division
	                try {
	                    System.out.print("Enter divisor: ");
	                    int divisor = scanner.nextInt();

	                    int result = value / divisor;  // May cause ArithmeticException
	                    System.out.println("Result: " + result);

	                } catch (ArithmeticException e) {
	                    System.out.println("Cannot divide by zero!");
	                }

	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Invalid array index!");
	            }

	        } finally {
	            scanner.close();
	        }
	    }
	}


