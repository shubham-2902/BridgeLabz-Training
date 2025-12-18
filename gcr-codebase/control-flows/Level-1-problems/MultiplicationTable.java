import java.util.Scanner;
public class MultiplicationTable{

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int number;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Printing multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
