package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by bilousyv on 13.09.2016.
 */
public class task407 {
    public static void main(String[] args) {

        int[] nums1 = ArrayUtils.createRandomArray(10, 1, 10);
        int[] nums2 = ArrayUtils.createRandomArray(10, 1, 10);

        System.out.println("Массив 1:");
        ArrayUtils.printArray(nums1);

        System.out.println("Массив 2:");
        ArrayUtils.printArray(nums2);

        int[] resNums = ArrayUtils.sumArrayData(nums1, nums2);

        System.out.println("Результирующий массив:");
        ArrayUtils.printArray(resNums);

    }
}
