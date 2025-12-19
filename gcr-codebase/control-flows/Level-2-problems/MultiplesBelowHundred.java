import java.util.Scanner;

public class MultiplesBelowHundred{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number less than 100: ");
        number = input.nextInt();

        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive number less than 100");
        }

        input.close();
    }
}
