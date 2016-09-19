package home_work.week3;


import utils.MultiArrayUtils;

//3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
public class Task31 {
    public static void main(String[] args) {

        int multiple = 5;
        int replacement = 8;

        int[][] matrix = MultiArrayUtils.createAndFillRandomMatrix(5, 5, 10, 150);
        System.out.println("Generated matrix:");
        MultiArrayUtils.printMatrix(matrix);
        MultiArrayUtils.replaceMultiples(matrix, multiple, replacement);
        System.out.println("Result matrix:");
        MultiArrayUtils.printMatrix(matrix);

    }
}
