import java.util.Scanner;

public class FactorialUsingFor{

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int number;
        long factorial = 1;
        

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Checking for natural number
        if (number >= 1) {

            // Calculating factorial
            for(int i=1;i<=number;i++)
            {
              factorial*=i; 
             }
            // Printing result
            System.out.println("Factorial of " + number + " is " + factorial);

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
