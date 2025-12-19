import java.util.Scanner;

public class FizzBuzz{

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
           int number = input.nextInt();

        // Checking for positive integer
        if (number >= 1) {

            // Looping from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
