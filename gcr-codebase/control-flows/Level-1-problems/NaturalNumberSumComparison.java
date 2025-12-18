import java.util.Scanner;
public class NaturalNumberSumComparison {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int number;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Checking if number is a natural number
        if (number >= 1) {

            // Sum using while loop
            int sumUsingLoop = 0;
            int counter = 1;

            while (counter <= number) {
                sumUsingLoop = sumUsingLoop + counter;
                counter++;
            }

            // Sum using formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Displaying results
            System.out.println("Sum using while loop = " + sumUsingLoop);
            System.out.println("Sum using formula = " + sumUsingFormula);

            // Comparing results
            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Results do not match.");
            }

        } 
        // Closing scanner
        input.close();
    }
}
