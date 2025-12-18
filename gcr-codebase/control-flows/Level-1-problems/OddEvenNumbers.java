import java.util.Scanner;
public class OddEvenNumbers{

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

            // Looping from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }

        } else {
            System.out.println("Please enter a natural number.");
        }

        input.close();
    }
}
