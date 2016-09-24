package utils;

/**
 * Created by gorobec on 17.09.16.
 */
public class MultiArrayUtils {

    public static int[][] createAndFillMatrix(int row, int column) {

        int[][] matrix = new int[row][column];

        int num = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = num++;
            }
        }
        return matrix;
    }

    public static int[][] createAndFillRandomMatrix(int row, int column, int min, int max) {

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = ArrayUtils.getRandomValue(min, max);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-4d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5s ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void replaceMultiples(int[][] matrix, int multiple, int replacement) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % multiple == 0)
                    matrix[i][j] = replacement;
            }
        }
    }

    public static boolean[][] createAndFillBooleanMatrix(int row, int column) {
        boolean[][] matrix = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (i == j);
            }
        }
        return matrix;
    }

    public static int[] getDiagonalOfMatrix(int[][] matrix) {
        int[] result = new int[matrix.length];
        if (matrix == null) return new int[0];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    public static void swapMinAndMaxRows(int[][] matrix) {
        int min, max, sumOf, minPos = 0, maxPos = 0;
        min = ArrayUtils.getSum(matrix[0]);
        max = min;
        for (int i = 1; i < matrix.length; i++) {

            sumOf = ArrayUtils.getSum(matrix[i]);

            if (min > sumOf){
                min = sumOf;
                minPos = i;
            }
            if (max < sumOf){
                max = sumOf;
                maxPos = i;
            }
        }
        swapRows(matrix, minPos, maxPos);
    }

    private static void swapRows(int[][] matrix, int pos1, int pos2) {
        int[] tmp = new int[Math.max(matrix[pos1].length, matrix[pos2].length)];
        System.arraycopy(matrix[pos1], 0, tmp, 0, tmp.length);
        System.arraycopy(matrix[pos2], 0, matrix[pos1], 0, matrix[pos1].length);
        System.arraycopy(tmp, 0, matrix[pos2], 0, matrix[pos2].length);
    }

    public static void swapMinAndMaxColumns(int[][] matrix) {
        int min, max, sumOf, minPos = 0, maxPos = 0;
        min = getSumOfColumn(matrix, 0);
        max = min;
        for (int i = 1; i < matrix.length; i++) {

            sumOf = getSumOfColumn(matrix, i);

            if (min > sumOf){
                min = sumOf;
                minPos = i;
            }
            if (max < sumOf){
                max = sumOf;
                maxPos = i;
            }
        }
        swapColumns(matrix, minPos, maxPos);
    }

    private static void swapColumns(int[][] matrix, int minPos, int maxPos) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            tmp = matrix[i][minPos];
            matrix[i][minPos] = matrix[i][maxPos];
            matrix[i][maxPos] = tmp;
        }
    }

    private static int getSumOfColumn(int[][] matrix, int column) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        return sum;
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {

        if (matrix1 == null || matrix2 == null || matrix1.length == 0 || matrix2.length == 0 || matrix1[0].length != matrix2.length){
            System.out.println("Matrix multiplication impossible.");
            return new int[0][0];
        }

        int l = matrix1.length;
        int n = matrix2[0].length;
        int m = matrix2.length;
        int[][] result = new int[l][n];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;

    }
}
