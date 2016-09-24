package home_work.week3;

import utils.ArrayUtils;
import utils.MultiArrayUtils;

/*
3.4. Создать массив, который будет состоять из диагонали матрици

1 3 5
4 5 7  -  1 5 6
4 5 6
*/
public class Task34 {
    public static void main(String[] args) {

        int[][] matrix = MultiArrayUtils.createAndFillRandomMatrix(5, 5, 10, 100);
        System.out.println("Source matrix:");
        MultiArrayUtils.printMatrix(matrix);

        int[] diagonal = MultiArrayUtils.getDiagonalOfMatrix(matrix);
        System.out.println("Result array:");
        ArrayUtils.printArray(diagonal);

    }
}
