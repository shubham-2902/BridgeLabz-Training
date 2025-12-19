import java.util.Scanner;
public class FizzBuzzWhileLoop {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int number;
        int counter = 1;

        // Taking user input
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Checking for positive integer
        if (number >= 1) {

            // While loop for FizzBuzz
            while (counter <= number) {

                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                } else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(counter);
                }

                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
