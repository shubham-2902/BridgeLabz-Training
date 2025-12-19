import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        input.close();
    }
}
