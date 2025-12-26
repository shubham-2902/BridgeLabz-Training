 import java.util.Scanner;
 public class PalindromeString
{
   public static Boolean isPalindrome( String str)
   {
    int start =0, end = str.length()-1;
     while(start<end)
     {
     if(str.charAt(start)!= str.charAt(end))

       return false;
        start++;
        end--;
      }
      return true;
}
   public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String input = sc.next();
if(isPalindrome(input))
{
System.out.println( input+ " is palindrome.");
}
else
{
System.out.println( input+ " is  not a palindrome.");
}
 }
}