import java.util.Scanner;
public class MultiplicationTableSP
     { 
       public static void main(String args[])

       {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the nummbers");
          int number = sc.nextInt();
          int table [] = new int[4];
           int j =6;
          for(int i=0;i<4;i++)
           {
            table[i]= number*j;
             j++;
           }
         j=6;

       for(int i=0;i<table.length;i++)
         {
          System.out.println(number+" * "+j+ "= "+table[i]);
          j++;
         }


        }
     
      }