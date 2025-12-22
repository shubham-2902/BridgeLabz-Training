public class MatrixAdvancedOperations {

    /* a. Create Random Matrix */
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int) (Math.random() * 9) + 1;
        return matrix;
    }

    /* b. Transpose of Matrix */
    public static double[][] transpose(double[][] matrix) {
        double[][] t = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                t[j][i] = matrix[i][j];
        return t;
    }

    /* c. Determinant of 2x2 Matrix */
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    /* d. Determinant of 3x3 Matrix */
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    /* e. Inverse of 2x2 Matrix */
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;
        return inv;
    }

    /* f. Inverse of 3x3 Matrix */
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0])/det;

        inv[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return transpose(inv); // adjoint / determinant
    }

    /* g. Display Matrix */
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix does not exist");
            return;
        }
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    /* Main Method */
    public static void main(String[] args) {

        System.out.println("2x2 Matrix:");
        double[][] m2 = generateMatrix(2, 2);
        displayMatrix(m2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(m2));

        System.out.println("\nDeterminant (2x2): " + determinant2x2(m2));

        System.out.println("\nInverse (2x2):");
        displayMatrix(inverse2x2(m2));

        System.out.println("\n===========================");

        System.out.println("3x3 Matrix:");
        double[][] m3 = generateMatrix(3, 3);
        displayMatrix(m3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(m3));

        System.out.println("\nDeterminant (3x3): " + determinant3x3(m3));

        System.out.println("\nInverse (3x3):");
        displayMatrix(inverse3x3(m3));
    }
}
