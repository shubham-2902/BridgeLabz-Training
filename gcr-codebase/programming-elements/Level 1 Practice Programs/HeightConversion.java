import java.util.Scanner;

public class HeightConversion 
    {
       public static void main(String[] args)
      {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double heightinCm = sc.nextDouble();

        double inches = heightinCm / 2.54;
        int heightinFeet = (int) (inches / 12); // Explicit casting for calculating 
        double remainingInches = inches % 12;

        System.out.println(
                "Your Height in cm is " + heightinCm +
                " while in feet is " + heightinFeet +
                " and inches is " + remainingInches
        );
     }
   }
