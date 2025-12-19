import java.util.Scanner;

public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int counter = 100;

        System.out.print("Enter a number less than 100: ");
        number = input.nextInt();

        if (number > 0 && number < 100) {
                 // Calculating the result using while loop
                 while (counter >= 1) 
                {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Enter a positive number less than 100");
        }

        input.close();
    }
}
