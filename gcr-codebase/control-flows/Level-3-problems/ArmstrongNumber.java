import java.util.Scanner;

public class ArmstrongNumber
  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int originalNumber;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        }
    }
