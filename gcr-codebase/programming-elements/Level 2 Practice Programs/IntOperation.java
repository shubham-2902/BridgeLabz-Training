import java.util.Scanner;

public class IntOperation 
   {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c; // first multiple b with c and then add a
        int result2 = a * b + c; // first multiple a with b and then add c
        int result3 = c + a / b; // first calculate a/b and then add the result with c
        int result4 = a % b + c; // first calculate a%b and then add the result with c

        System.out.println(
                "The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
   }
