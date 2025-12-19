import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, power;
        int result = 1;
        int counter = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();// taking the input from user for number
        System.out.print("Enter power: ");
        power = input.nextInt();// taking the input from user for power

        if (number > 0 && power >= 0) {
            while (counter < power) {
                result = result * number;
                counter++;
            }
            System.out.println("Result is " + result);
        } else {
            System.out.println("Enter valid positive values");
        }

        input.close();
    }
}
