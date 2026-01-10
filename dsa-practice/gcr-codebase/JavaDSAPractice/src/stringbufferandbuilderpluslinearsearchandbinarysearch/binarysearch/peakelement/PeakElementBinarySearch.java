package stringbufferandbuilderpluslinearsearchandbinarysearch.binarysearch.peakelement;
import java.util.Scanner;

public class PeakElementBinarySearch {

    // returns index of any peak element
    public static int findPeakIndex(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // handle boundary safely
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            // if both conditions satisfied => peak
            if (leftOK && rightOK) {
                return mid;
            }

            // if left neighbor is greater, peak must be on left side
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } 
            // else peak is on right side
            else {
                left = mid + 1;
            }
        }

        return -1; // should not happen
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeakIndex(arr);

        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak element: " + arr[peakIndex]);

        sc.close();
    }
}
