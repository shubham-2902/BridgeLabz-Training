import java.util.Scanner;
public class MaxHandShake

  {
     public static int calHandshakes(int n)
  {
     return (n*(n-1))/2;// calculated the maximum number of handshake 
   }
    public static void main(String args[])
   {
   Scanner sc = new Scanner(System.in);
   System.out.println(" Enter the numbers of Students:");

    int students = sc.nextInt();
System.out.println(" The maximum number of possible handshakes are "+  calHandshakes(students));  
    }

  }