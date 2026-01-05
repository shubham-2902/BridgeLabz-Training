package hashmapandhashfunctions.allsubarraywithzerosum;
import java.util.*;

public class ZeroSumSubarrayApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ZeroSumSubarrays.findAllZeroSumSubarrays(arr);
        sc.close();
    }
}
