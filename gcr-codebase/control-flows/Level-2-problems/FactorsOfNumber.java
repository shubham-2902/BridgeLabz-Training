import java.util.Scanner;
public class FactorsOfNumber {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int number;

        // Taking user input
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Checking for positive integer
        if (number >= 1) {

            System.out.println("Factors of " + number + " are:");

            // Looping to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
