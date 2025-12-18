import java.util.Scanner;

public class NaturalNumberSumForLoop {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int number;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Checking for natural number
        if (number >= 1) {

            // Sum using for loop
            int sumUsingLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumUsingLoop = sumUsingLoop + i;
            }

            // Sum using formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Printing results
            System.out.println("Sum using for loop = " + sumUsingLoop);
            System.out.println("Sum using formula = " + sumUsingFormula);

            // Comparing results
            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("Results do not match.");
            }

        } else {
            System.out.println("The number is not a natural number.");
        }

        input.close();
    }
}
