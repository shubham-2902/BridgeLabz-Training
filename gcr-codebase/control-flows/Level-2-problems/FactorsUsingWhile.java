import java.util.Scanner;

public class FactorsUsingWhile 
    {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int counter = 1;

        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        if (number > 0) 
             {
            System.out.println("Factors are:");
            while (counter <= number) 
                {
                if (number % counter == 0) 
                    {
                    System.out.println(counter);
                    }
                counter++;
                }
             } else {
            System.out.println("Enter a positive integer");
        }

        input.close();
    }
}
