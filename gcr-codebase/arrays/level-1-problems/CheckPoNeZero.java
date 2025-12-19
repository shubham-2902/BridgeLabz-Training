import java.util.Scanner;
public class CheckPoNeZero
     {
     public static void main(String args[])
      {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of five students:= ");
         int arr[]= new int[5];
        for(int i=0;i<arr.length;i++)
         {
            arr[i]= input.nextInt();

           }
   for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>0)
      {
      System.out.println(arr[i] + " is a positive number");
     if((arr[i]%2)!=0)
       {System.out.println(arr[i] + " is a odd positive number");}
     else
     {System.out.println(arr[i] + " is a even positive number");}
     }
     else if(arr[i]<0)
     {
      System.out.println(arr[i] + " is a negative number");
     }
    else
      {
       System.out.println(arr[i] + " is Zero");

      } 
}
     if( arr[0]>arr[arr.length -1])
     { System.out.println( "First element is greater then last element");
      }
     else if (arr[0]<arr[arr.length -1])
     {
      System.out.println( "First element is smaller then last element");
      }
     else
     { System.out.println("They are equal");}


 
       

         


         }


        }