package stringbufferandbuilderpluslinearsearchandbinarysearch.stringbuffer.concatestring;
import java.util.Scanner;

public class StringBufferConcat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        System.out.println("Enter  strings: ");
        sc.nextLine();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append(sc.nextLine());
        }

        System.out.println("Concatenated String: " + sb.toString());
    }
}
