import java.util.Scanner;
public class SumUntilZeroOrNegative {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        double total = 0.0;
        double userInput;

        // Infinite loop
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            userInput = input.nextDouble();

            // Break condition
            if (userInput <= 0) {
                break;
            }

            // Adding value to total
            total = total + userInput;
        }

        // Displaying total
        System.out.println("The total sum is " + total);

        // Closing scanner
        input.close();
    }
}
