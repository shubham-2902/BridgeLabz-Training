 public class StudentScorecard {

    // Generate PCM scores
    public static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 50) + 50;
            scores[i][1] = (int)(Math.random() * 50) + 50;
            scores[i][2] = (int)(Math.random() * 50) + 50;
        }
        return scores;
    }

    // Calculate percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(percent * 100) / 100.0;
        }
        return result;
    }

    // Grade calculation
    public static String getGrade(double percent) {
        if (percent >= 90) return "A";
        if (percent >= 75) return "B";
        if (percent >= 60) return "C";
        return "D";
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);

        System.out.println("\nPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");

        for (int i = 0; i < students; i++) {
            String grade = getGrade(results[i][2]);

            System.out.println(
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                grade
            );
        }
    }
}
