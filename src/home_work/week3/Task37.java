package home_work.week3;


//3.7. Умножить две матрицы.
// 

import utils.MultiArrayUtils;

public class Task37 {
    public static void main(String[] args) {

        int[][] matrix1 = MultiArrayUtils.createAndFillMatrix(2, 4);
        System.out.println("Matrix 1:");
        MultiArrayUtils.printMatrix(matrix1);

        int[][] matrix2 = MultiArrayUtils.createAndFillMatrix(4, 1);
        System.out.println("Matrix 2:");
        MultiArrayUtils.printMatrix(matrix2);

        int[][] resultMatrix = MultiArrayUtils.matrixMultiplication(matrix1, matrix2);

        System.out.println("Result:");
        MultiArrayUtils.printMatrix(resultMatrix);

    }
}
