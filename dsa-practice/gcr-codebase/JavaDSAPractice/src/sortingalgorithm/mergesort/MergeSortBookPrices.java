package sortingalgorithm.mergesort;
public class MergeSortBookPrices {

    public static void main(String[] args) {

        double[] prices = {499.50, 299.99, 799.00, 150.75, 399.20};

        System.out.println("Book Prices before sorting:");
        printArray(prices);

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("\nBook Prices after sorting (Ascending Order):");
        printArray(prices);
    }

    // Merge Sort method
    public static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves
    public static void merge(double[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArr = new double[n1];
        double[] rightArr = new double[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Print array
    public static void printArray(double[] arr) {
        for (double price : arr) {
            System.out.print(price + " ");
        }
    }
}
