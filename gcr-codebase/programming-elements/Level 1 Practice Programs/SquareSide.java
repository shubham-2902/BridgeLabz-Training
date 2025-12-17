import java.util.Scanner;

public class SquareSide 
    {
    public static void main(String[] args) 
      {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4; // Calculated side of square

        System.out.println(
                "The length of the side is " + side +
                " whose perimeter is " + perimeter
        );

     }
   }
