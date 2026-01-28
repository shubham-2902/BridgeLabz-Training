package com.exceptions;

import java.util.Scanner;

public class MultipleCatchBlock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = null;

        try {
            // Simulating a case where input might not be initialized
            System.out.print("Enter numerator: ");
            input = scanner.nextLine();

            int numerator = Integer.parseInt(input);

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");

        } catch (NullPointerException e) {
            System.out.println("Input is not initialized!");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric input!");

        } finally {
            scanner.close();
        }
    }
}
