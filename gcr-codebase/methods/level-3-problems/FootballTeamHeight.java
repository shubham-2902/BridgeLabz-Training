public class FootballTeamHeight {

    // Generate random heights between 150 and 250 cm
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) min = Math.min(min, h);
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) max = Math.max(max, h);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.println("Player Heights:");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nShortest Height = " + findShortest(heights));
        System.out.println("Tallest Height = " + findTallest(heights));
        System.out.println("Mean Height = " + findMean(heights));
    }
}
