package home_work.week2;

import java.util.Scanner;

/**
 * Created by User on 14.09.2016.
 */
public class Task501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int number = sc.nextInt();

        String binStr = decimalToBinary(number);
        System.out.println("Binary number: " + binStr);

        int decNumber = binaryToDecimal(binStr);
        System.out.println("Decimal number: " + decNumber);

    }

    private static String decimalToBinary(int number) {

        String result = "";

        do {
            result = (number % 2) + result;
            number = number / 2;
        } while (number > 0);

        return result;

    }

    private static int binaryToDecimal(String binStr) {

        int result = 0, pos;

        int lengthOfStr = binStr.length();

        for (int i = 0; i < lengthOfStr; i++) {
            pos = lengthOfStr - i - 1;
            result += (int) Math.pow(2, i) * (binStr.charAt(pos) - '0');
        }
        return result;
    }

}
