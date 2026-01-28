package com.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
        	while(true) {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
            
        	}

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");

        } finally {
            scanner.close();
        }
        }
}
