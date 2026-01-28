package com.exceptions;

import java.util.Scanner;

 class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    // Method that validates age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            validateAge(age);
            System.out.println("Access granted!");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        } finally {
        	
            scanner.close();
        }
    }
}
