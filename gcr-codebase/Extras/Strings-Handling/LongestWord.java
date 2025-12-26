import java.util.Scanner;
// methods for finding the longest word
public class LongestWord
{
 public static String findLongestWord(String sentence)
{
 String [] Words = sentence.split(" ");
 String longest = Words[0];
 for( String word : Words)
{
 if(word.length() > longest.length())
{
   longest = word;

}

}
return longest;

}
public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence");
    String input = sc.nextLine();
    System.out.println(" the longest word in the given sentence is "+findLongestWord(input));

}
}