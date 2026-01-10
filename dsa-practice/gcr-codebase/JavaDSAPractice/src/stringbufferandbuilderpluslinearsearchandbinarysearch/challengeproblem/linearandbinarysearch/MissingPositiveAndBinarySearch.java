package stringbufferandbuilderpluslinearsearchandbinarysearch.challengeproblem.linearandbinarysearch;
import java.util.*;

public class MissingPositiveAndBinarySearch {

    // ✅ Part 1: Find first missing positive integer
    // Uses visited boolean array (Linear style marking)
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // visited[i] means number i is present (only from 1 to n+1)
        boolean[] visited = new boolean[n + 2];

        // Mark numbers as visited
        for (int num : arr) {
            if (num > 0 && num <= n + 1) {
                visited[num] = true;
            }
        }

        // Find first number which is not visited
        for (int i = 1; i <= n + 1; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    // ✅ Part 2: Binary search for target index (after sorting)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (target < arr[mid]) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of list: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ✅ Find first missing positive
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        // ✅ Binary Search target index after sorting
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        Arrays.sort(arr); // must sort before binary search

        System.out.println("Sorted array: " + Arrays.toString(arr));

        int index = binarySearch(arr, target);
        System.out.println("Target Index (after sorting): " + index);

        sc.close();
    }
}
