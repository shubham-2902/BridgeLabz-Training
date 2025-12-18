import java.util.Scanner;

public class DoubleOperation 
   {
    public static void main(String[] args) 
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;// first multiple b with c and then add a
        double result2 = a * b + c;// first multiple a with b and then add c
        double result3 = c + a / b;// first calculate a/b and then add the result with c
        double result4 = a % b + c;// first calculate a%b and then add the result with c


        System.out.println(
                "The results of Double Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
  }
