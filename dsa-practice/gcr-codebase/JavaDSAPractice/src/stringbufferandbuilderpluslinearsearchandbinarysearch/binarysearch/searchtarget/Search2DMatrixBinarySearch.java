package stringbufferandbuilderpluslinearsearchandbinarysearch.binarysearch.searchtarget;
import java.util.Scanner;

public class Search2DMatrixBinarySearch {

    // returns true if target found, else false
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (target < midValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements (row-wise sorted):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);

        System.out.println(found ? " Target Found (true)" : "Target Not Found (false)");

        sc.close();
    }
}
