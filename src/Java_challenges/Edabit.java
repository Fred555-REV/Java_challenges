package Java_challenges;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BinaryOperator;

@SuppressWarnings("ALL")

public class Edabit {
    public static Map<String, String> mapping(String[] letters) {
        Map<String, String> result = new LinkedHashMap<>();
        for (String letter : letters) {
            result.put(letter, letter.toUpperCase());
        }
        System.out.println(result);
        return result;
    }

    public static String /*void*/ sevenBoom(int[] arr) {
        for (int i : arr) {
//            System.out.println(String.valueOf(i));
            for (int j = 0; j < String.valueOf(i).length(); j++) {
//                System.out.println(String.valueOf(i).charAt(j));

                if (String.valueOf(i).charAt(j) == '7') {
                    return "Boom!";
                }

            }

        }
        return "No 7 found in the array";
    }

    public static void countBoomerangs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int[] arrayofMultiples(int num, int length) {
        int[] array = new int[length];
        for (int i = 1; i <= length; i++) {
            array[i - 1] = (i * num);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[][] squarePatch(int n) {
        if (n == 0) {
            int[][] arr0 = new int[0][1];
            System.out.println(Arrays.deepToString(arr0));
            return arr0;
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = n;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }

    public static int convertTime(int initialTime) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Convert from what time? second/minute/hour/day/week/month/year");
        String fromTime = scan.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Convert to which time? second/minute/hour/day/week/month/year");
        String toTime = scan.nextLine().toLowerCase(Locale.ROOT);
        switch (fromTime) {
            case "second":
            case "seconds":
                switch (toTime) {
                    case "minute":
                    case "minutes":
                        return initialTime / 60;
                    case "hour":
                    case "hours":
                        return initialTime / 360;
                    case "day":
                    case "days":
                        return initialTime / 360 / 24;
                    case "week":
                    case "weeks":
                        return initialTime / 360 / 24 / 7;
                    case "month":
                    case "months":
                        return initialTime / 360 / 24 / 30;
                    case "year":
                    case "years":
                        return initialTime / 360 / 24 / 365;
                }
                System.out.println("Error, time not found");
                return 404;
            case "minute":
            case "minutes":
                switch (toTime) {
                    case "second":
                    case "seconds":
                        return initialTime * 60;
                    case "hour":
                    case "hours":
                        return initialTime / 60;
                    case "day":
                    case "days":
                        return initialTime / 60 / 24;
                    case "week":
                    case "weeks":
                        return initialTime / 60 / 24 / 7;
                    case "month":
                    case "months":
                        return initialTime / 60 / 24 / 30;
                    case "year":
                    case "years":
                        return initialTime / 60 / 24 / 365;
                }
                System.out.println("Error, time not found");
                return 404;
            case "hour":
            case "hours":
                switch (toTime) {
                    case "second":
                    case "seconds":
                        return initialTime * 360;
                    case "minute":
                    case "minutes":
                        return initialTime * 60;
                    case "day":
                    case "days":
                        return initialTime / 24;
                    case "week":
                    case "weeks":
                        return initialTime / 24 / 7;
                    case "month":
                    case "months":
                        return initialTime / 24 / 30;
                    case "year":
                    case "years":
                        return initialTime / 24 / 365;
                }
                System.out.println("Error, time not found");
                return 404;
            case "day":
            case "days":
                switch (toTime) {
                    case "second":
                    case "seconds":
                        return initialTime * 24 * 360;
                    case "minute":
                    case "minutes":
                        return initialTime * 24 * 60;
                    case "hour":
                    case "hours":
                        return initialTime * 24;
                    case "week":
                    case "weeks":
                        return initialTime / 7;
                    case "month":
                    case "months":
                        return initialTime / 30;
                    case "year":
                    case "years":
                        return initialTime / 365;
                }
                System.out.println("Error, time not found");
                return 404;
            case "week":
            case "weeks":
                switch (toTime) {
                    case "second":
                    case "seconds":
                        return initialTime * 7 * 24 * 360;
                    case "minute":
                    case "minutes":
                        return initialTime * 7 * 24 * 60;
                    case "hour":
                    case "hours":
                        return initialTime * 7 * 24;
                    case "day":
                    case "days":
                        return initialTime * 7;
                    case "month":
                    case "months":
                        return initialTime / 4;
                    case "year":
                    case "years":
                        return initialTime / 52;
                }
                System.out.println("Error, time not found");
                return 404;
            case "month":
            case "months":
                switch (toTime) {
                    case "second":
                    case "seconds":
                        return initialTime * 30 * 24 * 360;
                    case "minute":
                    case "minutes":
                        return initialTime * 30 * 24 * 60;
                    case "hour":
                    case "hours":
                        return initialTime * 30 * 24;
                    case "day":
                    case "days":
                        return initialTime * 30;
                    case "week":
                    case "weeks":
                        return initialTime * 4;
                    case "year":
                    case "years":
                        return initialTime / 12;
                }
                System.out.println("Error, time not found");
                return 404;
            case "year":
            case "years":
                switch (toTime) {
                    case "second":
                    case "seconds":
                        return initialTime * 365 * 24 * 360;
                    case "minute":
                    case "minutes":
                        return initialTime * 365 * 24 * 60;
                    case "hour":
                    case "hours":
                        return initialTime * 365 * 24;
                    case "day":
                    case "days":
                        return initialTime * 365;
                    case "week":
                    case "weeks":
                        return initialTime * 52;
                    case "month":
                    case "months":
                        return initialTime * 12;
                }
                System.out.println("Error, time not found");
                return 404;
        }
        System.out.println("Error, time not found");
        return 404;
    }

    public static String specialReverseString(String input) {
        List<Character> letterPosition = new ArrayList<>();
        List<Boolean> spacePositions = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            Character letter = input.charAt(i);
            if (letter == (' ')) {
                spacePositions.add(true);
            } else {
                letterPosition.add(letter.toLowerCase(letter));
                spacePositions.add(false);
            }
        }
        StringBuilder output = new StringBuilder();

        int reversePos = letterPosition.size() - 1;
        for (int j = 0; j < input.length(); j++) {
            Character letter = input.charAt(j);
            if (spacePositions.get(j)) {
                output.append(" ");
            } else {
                Character reverseLetter = letterPosition.get(reversePos);
                if (letter == letter.toUpperCase(letter)) {
                    output.append(reverseLetter.toUpperCase(reverseLetter));
                } else {
                    output.append(reverseLetter);
                }
                reversePos--;
            }
        }
        return output.toString();
    }

    public static String atBashCipher(String input) {
        StringBuilder output = new StringBuilder();
        System.out.println("\nEncoded");
        for (Character letter : input.toCharArray()) {
            System.out.print(encode(letter));
            output.append(encode(letter));
        }
        System.out.println("\nDecoded");
        for (Character letter : input.toCharArray()) {
            System.out.print(decode(encode(letter)));
        }
        System.out.println();
//        System.out.println();
        return output.toString();
    }

    public static Character encode(Character letter) {
        String upperBet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerBet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < upperBet.length(); i++) {
            if (letter == upperBet.charAt(i)) {
                return upperBet.charAt(upperBet.length() - 1 - i);
            } else if (letter == lowerBet.charAt(i)) {
                return lowerBet.charAt(lowerBet.length() - 1 - i);
            }
        }
        return letter;
    }

    public static Character decode(Character letter) {
        String upperBet = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        String lowerBet = "zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i < upperBet.length(); i++) {
            if (letter == upperBet.charAt(i)) {
                return upperBet.charAt(upperBet.length() - 1 - i);
            } else if (letter == lowerBet.charAt(i)) {
                return lowerBet.charAt(lowerBet.length() - 1 - i);
            }
        }
        return letter;
    }
}