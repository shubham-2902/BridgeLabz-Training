import java.util.Scanner;

public class FeetToYardMile 
    {
    public static void main(String[] args) 
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3; // calculated distance in  yards
        double miles = yards / 1760;// converted the distance into miles

        System.out.println(
                "Distance in feet is " + feet +
                ", in yards is " + yards +
                " and in miles is " + miles
        );
     }
   }
