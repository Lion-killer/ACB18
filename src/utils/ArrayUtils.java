package utils;

/**
 * Created by gorobec on 10.09.16.
 */
public class ArrayUtils {
//    public static <return_type> <name(verb)>(<input_type> <arg_name>...){
//
//              logic
//          if return_type != void
//                return some value(value type == <return_type>)
//          else
//                return doesn't need
//    }

    /**
     * Print array of Integers
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] createRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = getRandomValue(min, max);
        }

        return array;
    }

    private static boolean odd(int value) {
        return value % 2 == 0;
    }

    public static int[] createRandomArrayOddAndEven(int size, int min, int max) {

        int[] array = new int[size];
        int randomValue;

        for (int i = 0; i < size; i++) {

            do {
                randomValue = getRandomValue(min, max);
            } while (odd(i) == odd(randomValue));

            array[i] = randomValue;
        }

        return array;
    }

    private static int getRandomValue(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    public static int[] bubbleSort(int[] array) {

        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {

        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
//                if(array[i] > array[i + 1]){
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static String arrayToString(int[] array) {

        if (array == null) return null;

        String arrayAsString = "[";

        for (int i = 0; i < array.length - 1; i++) {
            arrayAsString += array[i] + ", ";
        }
        if (array.length > 0)
            arrayAsString += array[array.length - 1];

        return arrayAsString + "]";
    }


    public static String arrayToString(String[] array) {

        if (array == null) return null;

        String arrayAsString = "[";

        for (int i = 0; i < array.length - 1; i++) {
            arrayAsString += array[i] + ", ";
        }
        if (array.length > 0)
            arrayAsString += array[array.length - 1];

        return arrayAsString + "]";
    }

    private static void swap(Object[] array, int i, int j) {
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    public static int[] findMaxAndMin(int[] nums) {

        int min = nums[0];
        int max = nums[0];


        for (int number : nums) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        int[] result = {min, max};
        return result;
    }

    public static int getAverage(int[] nums) {

        int sum = 0;

        for (int number : nums) {
            sum += number;
        }

        return sum;
    }

    public static void changeMaxAndMin(int[] nums) {

        int min, minpos = 0, max, maxpos = 0, tmp;

        min = nums[0];
        max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                minpos = i;
            }
            if (max < nums[i]) {
                max = nums[i];
                maxpos = i;
            }
        }

        tmp = nums[minpos];
        nums[minpos] = nums[maxpos];
        nums[maxpos] = tmp;

    }

    public static void copyArrayData(int[] nums1, int[] nums2, int fromIndex, int toIndex) {

        if ((toIndex - fromIndex) > nums2.length)
            System.out.println("Количество элементов больше чем размер принимающего массива!");
        else
            for (int i = fromIndex; i <= toIndex; i++) {
                nums2[i - fromIndex] = nums1[i];
            }

    }

    public static int countOfValue(int[] nums, int value) {

        int result = 0;

        for (int number : nums) {
            result += number == value ? 1 : 0;
        }

        return result;
    }

    public static int[] halfArrayMaxAverage(int[] nums) {

        int middle = nums.length / 2;
        int[] nums1 = new int[middle];
        int[] nums2 = new int[middle];

        copyArrayData(nums, nums1, 0, middle - 1);
        copyArrayData(nums, nums2, nums.length - middle, nums.length - 1);

        int averageSum1 = getAverage(nums1);
        int averageSum2 = getAverage(nums2);

        if (averageSum1 > averageSum2)
            return nums1;
        else
            return nums2;

    }

    public static int[] sumArrayData(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums1[i] + nums2[i];
        }
        return result;
    }

    public static int[] splitArray(int[] nums, int startIndex, int endIndex) {

        int lengthResult = endIndex - startIndex + 1;
        int[] result = new int[lengthResult];
        copyArrayData(nums, result, startIndex, endIndex);

        return result;

    }
}