package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 14.09.2016.
 */
public class Task410 {
    public static void main(String[] args) {

        int[] nums = ArrayUtils.createArray(10);

        System.out.println("Исходный массив:");
        ArrayUtils.printArray(nums);

        int[] res = ArrayUtils.splitArray(nums, 2, 7);
        System.out.println("Результирующий массив:");
        ArrayUtils.printArray(res);

    }
}
