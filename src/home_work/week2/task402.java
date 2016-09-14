package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 13.09.2016.
 */
public class task402 {
    public static void main(String[] args) {

        int[] nums = ArrayUtils.createRandomArray(10, 1, 10);
        int sum = ArrayUtils.getAverage(nums);
        ArrayUtils.printArray(nums);
        System.out.printf("Среднее арифметическое: %d \n", (sum / nums.length));

    }
}
