package home_work.week3;

import utils.MultiArrayUtils;

//	3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
//       b) Поменять наибольший и наименьший столбик в двухмерном массиве.
public class Task35 {
    public static void main(String[] args) {

        int[][] matrix = MultiArrayUtils.createAndFillMatrix(5, 5);
        System.out.println("Source matrix:");
        MultiArrayUtils.printMatrix(matrix);

        MultiArrayUtils.swapMinAndMaxColumns(matrix);
        System.out.println("After swapping min and max columns of matrix:");
        MultiArrayUtils.printMatrix(matrix);

        MultiArrayUtils.swapMinAndMaxRows(matrix);
        System.out.println("After swapping min and max rows of matrix:");
        MultiArrayUtils.printMatrix(matrix);

    }
}
