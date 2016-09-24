package home_work.week3;

//3.3. Написать метод, который проверяет является ли строка палиндромом

import utils.StringUtils;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;

        System.out.println("Enter text: ");
        text = sc.nextLine();
//        text = "И мал Иван, а лупил у лип улана вилами!";

        boolean isPalindrome = StringUtils.isPalindrome(text);
        if (isPalindrome)
            System.out.printf("The text %s is palindrome.", text);
        else
            System.out.printf("The text %s is not palindrome.", text);

    }
}
