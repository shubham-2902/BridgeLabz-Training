package sortingalgorithm.selectionsort;
public class SelectionSortExamScores {

    public static void main(String[] args) {

        int[] scores = {88, 72, 95, 65, 80};

        System.out.println("Exam Scores before sorting:");
        printArray(scores);

        // Selection Sort logic
        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("\nExam Scores after sorting (Ascending Order):");
        printArray(scores);
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
