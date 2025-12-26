import java.util.Scanner;
public class ReverseString
{
   // Methods for finding the reverse of the string
   public static String reverseString( String str)
 {
    String rev = "";
  for( int i=str.length()-1;i>=0;i--)
{
    rev= rev+ str.charAt(i);  

}
 return rev;
}

public  static void main( String args[])
{
 Scanner sc = new Scanner(System.in);
System.out.println(" Enter the String");
 String input = sc.next();
System.out.println(" Your reverted String is "+reverseString(input ) );

}

}