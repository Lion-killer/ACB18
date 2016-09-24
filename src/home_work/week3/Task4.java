package home_work.week3;

import java.util.Scanner;

/*4. Верхний регистр.

        Напишите программу, которая позволяет пользователю ввести в консоли строку,
        переводит первый символ слов в верхний регистр и результат выводит в консоль

        Вход:
        иван васильевич

        Выход:
        Иван Васильевич*/
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;

        System.out.println("Enter text: ");
        text = sc.nextLine();

        String resultStr = utils.StringUtils.allWordsToUpperTitle(text);
        System.out.printf("Result: %s", resultStr);

    }
}
