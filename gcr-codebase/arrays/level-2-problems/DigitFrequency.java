import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int temp;
        int count = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        temp = number;

        // count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        temp = number;

        // store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }

        input.close();
    }
}
