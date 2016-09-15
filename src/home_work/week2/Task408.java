package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 13.09.2016.
 */
public class Task408 {
    public static void main(String[] args) {

        int[] nums = ArrayUtils.createRandomArrayOddAndEven(20, 1, 10);
        System.out.println("Результирующий массив:");
        ArrayUtils.printArray(nums);

    }
}
