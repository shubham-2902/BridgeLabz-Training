import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        input.close();
    }
}
