package sortingalgorithm.countingsort;
public class CountingSortStudentAges {

    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 14, 18, 12, 16, 10, 15};

        System.out.println("Student ages before sorting:");
        printArray(ages);

        countingSort(ages, 10, 18);

        System.out.println("\nStudent ages after sorting (Ascending Order):");
        printArray(ages);
    }

    public static void countingSort(int[] arr, int minAge, int maxAge) {

        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Step 1: Count frequency of each age
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Step 2: Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in correct position
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy output to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
