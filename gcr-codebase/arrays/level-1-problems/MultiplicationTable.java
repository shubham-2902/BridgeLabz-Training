import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int[] table = new int[10];

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 0; i <10; i++) {
            table[i] = number * (i+1);
        }
         
        // Prinnting the result
        for (int i = 0; i <10; i++) {
            System.out.println(number + " * " + (i+1)+ " = " + table[i]);
        }

        input.close();
    }
}
