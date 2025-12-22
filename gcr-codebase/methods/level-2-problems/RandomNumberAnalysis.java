public class RandomNumberAnalysis {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, min and max
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit numbers:");
        for (int n : randomNumbers) {
            System.out.print(n + " ");
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage value = " + result[0]);
        System.out.println("Minimum value = " + (int)result[1]);
        System.out.println("Maximum value = " + (int)result[2]);
    }
}
