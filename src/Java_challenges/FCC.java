package Java_challenges;

import java.util.Arrays;

public class FCC {

    public static String reverseString(String initialString) {
        StringBuilder reverse = new StringBuilder();
        for (int i = initialString.length() - 1; i >= 0; i--) {
            reverse.append(initialString.charAt(i));
        }
        return reverse.toString();
    }   // String finalStr2 = String.join("", (CharSequence) dataReversed);
        // Gabriel's ^^^^^code^^^^^ solution for his reverseString method

    public static int factorial(int num) {
        int factor = 0;
        if (num <= 1) {
            factor = 1;
        } else {
            for (int i = 0; i < num; i++) {
                factor = num * factorial(num - 1);
            }
        }
        return factor;
    }

    public static String findLargestString(String sentence) {
        String[] words = sentence.split(" ");
        String largestWord = "";
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        return largestWord;
    }

    public static void arrayOfLargest(int[][] arrays) {
        int[] arrOfLargest = new int[arrays.length];
        int i = 0;
        for (int[] arr : arrays) {
            int largestInArr = -9999;
            for (int number : arr) {
                if (number > largestInArr) {
                    largestInArr = number;
                }
            }
            arrOfLargest[i] = largestInArr;
            i++;
        }
        System.out.println(Arrays.toString(arrOfLargest));
    }

    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    public static String confirmTheEnding(String sentence, String ending) {

        String[] words = sentence.split(" ");
        String lastWord = words[words.length - 1];
        int trueCounter = 0;
        if (lastWord.length() >= ending.length()) {
            int start = lastWord.length() - ending.length();
            for (int i = start; i < lastWord.length(); i++) {
                if (lastWord.charAt(i) == ending.charAt(i - start)) {
                    trueCounter++;
                }
            }
            if (trueCounter == ending.length()) {
                return "true";
            } else {
                return "false";
            }
        } else {
            return "false";
        }
    }
}