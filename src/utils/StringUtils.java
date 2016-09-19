package utils;

/**
 * Created by gorobec on 18.09.16.
 */
public class StringUtils {

    public static String wordInvertion(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {
            swap(letters, i, letters.length - i - 1);
        }
        return new String(letters);
    }

    private static void swap(char[] letters, int i, int j) {
        char tmp = letters[i];
        letters[i] = letters[j];
        letters[j] = tmp;
    }

    public static String deleteEvenLetter(String word) {
        char[] letters = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            if (i % 2 != 0) {
                sb.append(letters[i]);
            }
        }
        return sb.toString();
    }

    public static String getMaxWord(String[] words) {
        int pos = 0, max;
        if (words == null || words.length == 0) return "";

        max = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                pos = i;
            }
        }
        return words[pos];
    }

    public static String getMinWord(String[] words) {
        int pos = 0, min;
        if (words == null || words.length == 0) return "";

        min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min) {
                min = words[i].length();
                pos = i;
            }
        }
        return words[pos];
    }

    public static String arrayToString(String[] array) {

        if (array == null) return null;

        String arrayAsString = "";

        for (int i = 0; i < array.length - 1; i++) {
            arrayAsString += array[i] + " ";
        }
        if (array.length > 0)
            arrayAsString += array[array.length - 1];

        return arrayAsString + "";
    }

    public static String replaceAll(String[] words, String substring, String replacement) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(substring))
                words[i] = replacement;
        }

        return arrayToString(words);
    }

    public static String allWordsToUpperTitle(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        return arrayToString(words);
    }
}
