package stringbufferandbuilderpluslinearsearchandbinarysearch.stringbuilder.removeduplicates;
import java.util.*;

public class RemoveDuplicatesSB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + sb.toString());
    }
}

