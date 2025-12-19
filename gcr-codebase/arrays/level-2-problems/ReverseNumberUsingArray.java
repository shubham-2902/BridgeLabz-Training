import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int temp;
        int count = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        temp = number;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int[] reverse = new int[count];

        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[i];
        }

        System.out.println("Reversed Number:");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }

        input.close();
    }
}
