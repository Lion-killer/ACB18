package home_work.week2;

import java.util.Scanner;

/**
 * Created by User on 15.09.2016.
 */
public class Task503 {
    public static void main(String[] args) {

        String numberStr;
        int result = 0;
        char seekSymbol = '8';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        numberStr = sc.next();

        char[] charArray = numberStr.toCharArray();
        for (char symbol : charArray) {
            result += symbol == seekSymbol ? 1 : 0;
        }

        System.out.printf("Symbol %c occurs %d times", seekSymbol, result);

    }
}
