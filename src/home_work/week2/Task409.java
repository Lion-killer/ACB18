package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 14.09.2016.
 */
public class Task409 {
    public static void main(String[] args) {
        int[] nums1 = ArrayUtils.createRandomArray(10, 25, 75);
        int[] nums2 = ArrayUtils.createRandomArray(10, 25, 75);

        System.out.println("Массив 1:");
        ArrayUtils.printArray(nums1);

        System.out.println("Массив 2:");
        ArrayUtils.printArray(nums2);

        int countOfOddElements1 = ArrayUtils.countOfOddElements(nums1);
        int countOfOddElements2 = ArrayUtils.countOfOddElements(nums2);

        System.out.printf("Массив 1 содержит: %d четных элементов, массив 2 содержит %d четных элементов \n", countOfOddElements1, countOfOddElements2);

        if (countOfOddElements1 > countOfOddElements2)
            System.out.println("В массиве 1 больше");
        else if (countOfOddElements1 == countOfOddElements2)
            System.out.println("Одинаковое количество");
        else
            System.out.println("В массиве 2 больше");

    }
}
