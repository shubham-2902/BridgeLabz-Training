package sortingalgorithm.quicksort;
public class QuickSortProductPrices {

    public static void main(String[] args) {

        double[] prices = {999.99, 299.50, 799.00, 199.99, 499.75};

        System.out.println("Product Prices before sorting:");
        printArray(prices);

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\nProduct Prices after sorting (Ascending Order):");
        printArray(prices);
    }

    // Quick Sort method
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // Sort left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method (Last element as pivot)
    public static int partition(double[] arr, int low, int high) {

        double pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Print array
    public static void printArray(double[] arr) {
        for (double price : arr) {
            System.out.print(price + " ");
        }
    }
}
