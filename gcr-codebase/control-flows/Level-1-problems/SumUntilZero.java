import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        double total = 0.0;
       

        // Taking first input
        System.out.print("Enter a number (0 to stop): ");
         double userInput = input.nextDouble();

        // Loop until user enters 0
        while (userInput != 0) {
            total = total + userInput;

            System.out.print("Enter a number (0 to stop): ");
            userInput = input.nextDouble();
        }

        // Displaying result
        System.out.println("The total sum is " + total);

        // Closing scanner
        input.close();
    }
}
