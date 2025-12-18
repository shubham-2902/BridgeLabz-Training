import java.util.Scanner;


public class CheckSmall
  {

      public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        // Declaring variables for input numbers
        int number1;
        int number2;
        int number3;

        // Taking input from the user
        System.out.println("Enter the three numbers:");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();

        // Checking if the first number is the smallest
        String result = (number1 < number2 && number1 < number3) ? "Yes" : "No";

        
        System.out.println(
                "Is the first number the smallest? " + result
        );

        // Closing the scanner
        sc.close();
    }
}
