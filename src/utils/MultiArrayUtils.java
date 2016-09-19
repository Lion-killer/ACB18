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

}
