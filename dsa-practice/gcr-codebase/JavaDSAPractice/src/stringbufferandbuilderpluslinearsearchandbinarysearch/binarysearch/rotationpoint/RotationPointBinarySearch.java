package stringbufferandbuilderpluslinearsearchandbinarysearch.binarysearch.rotationpoint;
import java.util.Scanner;

public class RotationPointBinarySearch {

    // returns index of smallest element (rotation point)
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is greater than the right element,
            // smallest element must be in right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } 
            // Otherwise smallest element is in left half including mid
            else {
                right = mid;
            }
        }

        // left == right is the index of smallest element
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (rotated sorted array):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findRotationPoint(arr);

        System.out.println("Rotation point index (smallest element index): " + index);
        System.out.println("Smallest element: " + arr[index]);

        sc.close();
    }
}
