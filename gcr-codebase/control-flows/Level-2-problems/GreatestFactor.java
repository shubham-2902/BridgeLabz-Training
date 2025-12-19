import java.util.Scanner;

public class GreatestFactor
   {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int greatestFactor = 1;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor (beside itself) is " + greatestFactor);
        input.close();
     }
  }
