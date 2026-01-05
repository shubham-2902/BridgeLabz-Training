package sortingalgorithm.heapsort;
public class HeapSortSalaries {

    public static void main(String[] args) {

        int[] salaries = {45000, 70000, 30000, 90000, 60000};

        System.out.println("Salary demands before sorting:");
        printArray(salaries);

        heapSort(salaries);

        System.out.println("\nSalary demands after sorting (Ascending Order):");
        printArray(salaries);
    }

    // Heap Sort method
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify method
    public static void heapify(int[] arr, int heapSize, int rootIndex) {

        int largest = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;

        // Check left child
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check right child
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // Swap and continue heapifying if needed
        if (largest != rootIndex) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            heapify(arr, heapSize, largest);
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
