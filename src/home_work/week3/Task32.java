package home_work.week3;

import utils.MultiArrayUtils;

/*3.2. Создать логическую матрицу по следующим критериям,
        если і равно j, то элементом будет true.*/
public class Task32 {
    public static void main(String[] args) {

        int row = 10;
        int column = 10;

        boolean[][] matrix = MultiArrayUtils.createAndFillBooleanMatrix(row, column);

        System.out.println("Result matrix:");
        MultiArrayUtils.printMatrix(matrix);
    }
}
