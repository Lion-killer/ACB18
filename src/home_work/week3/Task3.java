package home_work.week3;

/*3. Напишите метод, заменяющий в строке все вхождения слова «бяка»
        на «вырезано цензурой»(не используя метод replaceAll()).*/

import utils.StringUtils;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;
        String replacement = "вырезано цензурой";
        String substring = "бяка";

        System.out.println("Enter text: ");
        text = sc.nextLine();

        String resultStr = StringUtils.replaceAll(text, substring, replacement);

        System.out.printf("Result: \n %s", resultStr);

    }
}
