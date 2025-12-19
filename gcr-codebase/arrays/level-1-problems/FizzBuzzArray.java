import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Enter a positive number");
            System.exit(0);
        }

        String[] result = new String[number + 1];

        for (int i = 0; i <= number; i++) {

            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i != 0 && i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i != 0 && i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        input.close();
    }
}
