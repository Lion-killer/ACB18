package home_work.week3;

/*
2. Ввести предложение с консоли, найти самое короткое и самое длинное слово.
        Вывести найденные слова и их длину.
*/

import utils.StringUtils;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;

        System.out.println("Enter text: ");
        text = sc.nextLine();

        String maxWord = StringUtils.getMaxWord(text);
        String minWord = StringUtils.getMinWord(text);

        System.out.printf("Min word: %s, max word: %s", minWord, maxWord);

    }
}
