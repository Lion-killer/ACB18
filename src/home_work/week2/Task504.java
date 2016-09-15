package home_work.week2;

import utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by User on 15.09.2016.
 */
public class Task504 {
    public static void main(String[] args) {

        int number, result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        number = sc.nextInt();

        int[] fibonacciArray = ArrayUtils.getFibonacciArray(number);

        System.out.printf("Последовательность Фибоначчи до позиции %d\n", number);
        ArrayUtils.printArray(fibonacciArray);

        System.out.printf("Элемент последовательности под номером %d равен: %d", number, fibonacciArray[number - 1]);

    }

}
