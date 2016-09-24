package home_work.week3;


import utils.ArrayUtils;

import java.util.Scanner;

/*
3.6. Нули
Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
    Вход:
        10001101001
    Выход:
        (2,4) - цепочка нулей
        (5,6) - цепочка единиц
*/
public class Task36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность нулей и единиц:");
        String source = sc.nextLine();

        // найти строку с максимальным количеством символов
        String longest0 = getLongest(source, "1");
        String longest1 = getLongest(source, "0");

        System.out.printf("Цепочка нулей %s: \n", getPosition(source, longest0));
        System.out.printf("Цепочка единиц %s: \n", getPosition(source, longest1));

   }

    private static String getPosition(String source, String substring) {
        int position = source.indexOf(substring);
        return String.format("(%d, %d)", position + 1, position + substring.length());
    }

    private static String getLongest(String source, String regex) {

        String[] array = source.split(regex);
        int maxCount = 0, position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxCount){
                maxCount = array[i].length();
                position = i;
            }
        }

        return array[position];

    }
}
