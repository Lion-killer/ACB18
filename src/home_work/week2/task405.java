package home_work.week2;

import utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by bilousyv on 13.09.2016.
 */
public class task405 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = ArrayUtils.createRandomArray(10, 1, 10);
        int value;

        System.out.println("Случайный массив:");
        ArrayUtils.printArray(nums);

        System.out.println("Введите число:");
        value = sc.nextInt();

        int count = ArrayUtils.countOfValue(nums, value);
        System.out.printf("Количество цифр %d в массиве составляет: %d", value, count);
    }
}
