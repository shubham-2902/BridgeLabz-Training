package sortingalgorithm.bubblesort;
public class BubbleSortStudentMarks {

    public static void main(String[] args) {

        int[] marks = {78, 45, 89, 62, 91, 55};

        System.out.println("Marks before sorting:");
        printArray(marks);

        // Bubble Sort logic
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {

                if (marks[j] > marks[j + 1]) {
                    // swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("\nMarks after sorting (Ascending Order):");
        printArray(marks);
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
