import java.util.Scanner;
 public class CountVowelsConsonants
  {
    public static int[] countVowelsConsonants(String str)

  {
    int vowels =0; int consonants =0; int hasAlphabets=0;
    for(int i =0;i<str.length();i++)
  {
    char ch = Character.toLowerCase(str.charAt(i));
     if( ch >= 'a' && ch<= 'z')
    {
      hasAlphabets =1;
      if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
       {vowels++; }
    else { consonants++;}
   }
}
 return new int[] {vowels, consonants, hasAlphabets};

}


   public static void main( String [] args)
{
  Scanner sc  = new Scanner(System.in);
  System.out.println(" Enter a String ");
   String input = sc.nextLine();
  int result[]= countVowelsConsonants(input);
// checking for Not a alphabetic character
if(result[2]==0)
{
System.out.println("  Not a alphabetic character");
}
else{

System.out.println("  Numbers of vowels is "+ result[0]);
System.out.println("  Numbers of consonants is "+ result[1]);
}

}
 }