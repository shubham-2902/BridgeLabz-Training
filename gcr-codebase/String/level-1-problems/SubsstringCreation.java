import java.util.Scanner;
public class SubsstringCreation
{

public static String makeStringusingcharAt( String str, int start, int end)
  {  
      String substr1 = "";
     for(int i=start;i<end;i++)
     {
      substr1+= str.charAt(i);       
      }
  return substr1;
  }
public static String makeStringusingsubstring( String str, int start, int end)
  {
    String substr2 = str.substring(start,end);
     return substr2;
  }
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);

 System.out.println("Enter String , Starting index and Ending index");
      String st = sc.next();
     int StartingIndex = sc.nextInt();
     int EndingIndex = sc.nextInt();
System.out.println("Substring usingcharAt is :- "+ makeStringusingcharAt(st,StartingIndex,EndingIndex));
System.out.println("Substring usingsubstring is :- "+ makeStringusingsubstring(st,StartingIndex,EndingIndex));
  if(makeStringusingcharAt(st,StartingIndex,EndingIndex).equals(makeStringusingsubstring(st,StartingIndex,EndingIndex)))
{
System.out.println(" Both gives the same result");
}
else
{
System.out.println(" Both gives the diffrent result");
}

}




}