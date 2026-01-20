package com.extra.stringmanipulation;
import java.util.*;
public class StringTransformation {
public  static String CleanseAndInvert(String input) {
	
	// checking for null and 6 character long
	if(input==null|| input.length()<6)
	{
		return "";
		
	}
	// checking for speacial character
	for (int i = 0; i < input.length(); i++) {
	    char ch = input.charAt(i);
	    int ascii = (int) ch;

	    // check only alphabets: A-Z or a-z
	    if (!((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))) {
	        return "";
	    }
	}

	 // logic 1 change to lowercase
	 String str= input.toLowerCase();
	 // logic 2 remove all charcter whose ASCII values are even number
	 StringBuilder filtered = new StringBuilder();
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (((int) ch) % 2 != 0) {   // keep only odd ASCII
             filtered.append(ch);
         }
     }
	 // Reverse the string
     filtered.reverse();
     StringBuilder finalString= new StringBuilder();
     
	 // convert to uppercase for even position character
     for( int i=0;i<=filtered.length()-1;i++)
     {
    	    if(i %2==0)
    	    {
    	    	finalString.append((char)((int)(filtered.charAt(i))-32));
    	    }
    	    else {
				finalString.append(filtered.charAt(i));
			}
    	 
     }
   return finalString.toString();      
}
     public static void main(String args[])
     {
    	  System.out.println("Enter the String");
    	  Scanner sc = new Scanner(System.in);
    	  String Input = sc.nextLine();
    	 String output = CleanseAndInvert(Input);
    	 if(output=="") {
    		 System.out.println("Invalid Input");
    	 }
    	 else {
    		 System.out.println("The Generated Key is- "+output);
		}
    	   }
}
