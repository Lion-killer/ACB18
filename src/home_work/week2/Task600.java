package home_work.week2;

import utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by bilousyv on 16.09.2016.
 */
public class Task600 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfRetries = 5, enteredNumber, retr = 0;
        int randomValue = ArrayUtils.getRandomValue(25, 125);

        while (true){

            retr++;

            if (retr > numberOfRetries){
                System.out.println("Вы исчерпали все попытки.");
                break;
            }

            System.out.println("Введите число:");
            enteredNumber = sc.nextInt();

            if (enteredNumber == randomValue){
                if (retr == 1)
                    System.out.println("Поздравляем, вы угадали число с первого раза!");
                else
                    System.out.printf("Поздравляем, вы угадали число, использовано попыток: %d\n", retr);

                break;
            }
            else if (enteredNumber > randomValue)
                System.out.println("Неправильно, искомое число меньше.");
            else
                System.out.println("Неправильно, искомое число больше.");

        }

    }
}
