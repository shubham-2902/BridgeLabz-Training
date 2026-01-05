package sortingalgorithm.insertionsort;
public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        int[] employeeIds = {105, 102, 110, 101, 108};

        System.out.println("Employee IDs before sorting:");
        printArray(employeeIds);

        // Insertion Sort Logic
        for (int i = 1; i < employeeIds.length; i++) {
            int key = employeeIds[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert key at correct position
            employeeIds[j + 1] = key;
        }

        System.out.println("\nEmployee IDs after sorting (Ascending Order):");
        printArray(employeeIds);
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
