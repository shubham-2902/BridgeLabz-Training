import java.util.Scanner;

public class AreaOfTriangle 
  {
        public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height; //Calculated area in inches

        double baseCm = base * 2.54;
        double heightCm = height * 2.54;
        double areaInCm = 0.5 * baseCm * heightCm; // Calculated area in centimeter

        System.out.println(
                "Area of triangle is " + areaInInches + " square inches and "
                + areaInCm + " square centimeters"
        );
    }
 }
