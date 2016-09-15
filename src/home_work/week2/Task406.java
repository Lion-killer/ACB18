package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 13.09.2016.
 */
public class Task406 {
    public static void main(String[] args) {

        int[] nums = ArrayUtils.createRandomArray(11, 1, 10);

        System.out.println("Исходный массив:");
        ArrayUtils.printArray(nums);

        int[] halfArrayMaxAverage = ArrayUtils.halfArrayMaxAverage(nums);

        System.out.println("Результирующий массив:");
        ArrayUtils.printArray(halfArrayMaxAverage);

    }

}
