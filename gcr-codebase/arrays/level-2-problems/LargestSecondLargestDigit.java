import java.util.Scanner;

public class 
 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);

        input.close();
    }
}
