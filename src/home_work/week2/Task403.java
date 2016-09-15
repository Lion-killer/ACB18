package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 13.09.2016.
 */
public class Task403 {
    public static void main(String[] args) {

        int[] nums = ArrayUtils.createArray(10);

        System.out.println("Исходный массив:");
        ArrayUtils.printArray(nums);

        ArrayUtils.changeMaxAndMin(nums);
        System.out.println("Результирующий массив:");
        ArrayUtils.printArray(nums);

    }
}
