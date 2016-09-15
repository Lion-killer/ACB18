package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 13.09.2016.
 */
public class Task401 {
    public static void main(String[] args) {

        int[] nums = ArrayUtils.createRandomArray(10, 1, 100);


        int[] result = ArrayUtils.findMaxAndMin(nums);

        ArrayUtils.printArray(nums);
        System.out.printf("max: %d, min: %d \n", result[0], result[1]);
    }
}
