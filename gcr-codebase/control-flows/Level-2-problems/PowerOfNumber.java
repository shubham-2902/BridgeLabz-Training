import java.util.Scanner;

public class PowerOfNumber
    {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, power;
        int result = 1;

        System.out.print("Enter number: ");
        number = input.nextInt();
        System.out.print("Enter power: ");
        power = input.nextInt();

        if (number > 0 && power >= 0) {
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println("Result is " + result);
        } else {
            System.out.println("Enter valid positive values");
        }

        input.close();
    }
}
