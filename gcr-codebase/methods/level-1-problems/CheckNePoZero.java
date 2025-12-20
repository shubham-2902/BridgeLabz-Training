import java.util.Scanner;
public class CheckNePoZero
{
  public static int CheckNumber(int number)
{
 if(number<0){ return -1;}
else if(number>0){ return 1;}
else{ return 0;}
}
public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println(" enter the number");
   int num = sc.nextInt();
System.out.println(CheckNumber(num));


}
}




