import java.util.Scanner;

// methods for removing  the duplicates
public class RemoveDuplicates
{
public static String  removeDuplicates(String str)
{
 String result= "";
for( int i=0; i< str.length();i++)
{
  if(! result.contains(String.valueOf(str.charAt(i))))
{
    result+=str.charAt(i);

}
 
}
return result;

}
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String input = sc.next();
    System.out.println(" updated string after removing duplicates: "+ removeDuplicates(input));


}
}