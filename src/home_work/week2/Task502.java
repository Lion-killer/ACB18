package home_work.week2;

import java.util.Scanner;

/**
 * Created by User on 15.09.2016.
 */
public class Task502 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result;

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        result = getFactorial(number);

        System.out.printf("Factorial %d is %d\n", number, result);

    }

    private static int getFactorial(int number) {
        int result = 0;
        for (int n = 1; n <= number; n++) {
            result = n == 1 ? 1 : result * n;
        }
        return result;
    }
}
