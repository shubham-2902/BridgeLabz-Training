import java.util.Scanner;


public class NaturalNumberSum {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int number;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Checking if the number is natural
        if (number >= 0) {

            // Calculating sum of n natural numbers
            int sumOfNaturalNumbers = number * (number + 1) / 2;

            // Displaying result
            System.out.println(
                    "The sum of " + number + " natural numbers is " + sumOfNaturalNumbers
            );
        } else {
            // Displaying message for non-natural number
            System.out.println(
                    "The number " + number + " is not a natural number"
            );
        }

        // Closing scanner
        input.close();
    }
}
