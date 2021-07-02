package Java_challenges;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void mapping() {
        String[] arr3 = new String[]{"a", "b", "c"};
        System.out.println("input is: abc");
        Edabit.mapping(arr3);
    }

    public static void sevenBoom() {
        int[] numArr3 = new int[]{2, 55, 60, 97, 86};
        System.out.println("input is: 2, 55, 60, 97, 86");
        System.out.println(Edabit.sevenBoom(numArr3));// yes
    }

    public static void countBoomerangs() {
        int[] arrBoom1 = {9, 5, 9, 5, 1, 1, 1};
        System.out.println("input is: 9, 5, 9, 5, 1, 1, 1");
        Edabit.countBoomerangs(arrBoom1);// ➞ 2
    }

    public static void arrayOfMultiples() {
        Edabit.arrayofMultiples(7, 5);
    }

    public static void squarePatch() {
        Edabit.squarePatch(0);
        Edabit.squarePatch(1);
        Edabit.squarePatch(3);
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

    public static void reverseString() {
        System.out.println(FCC.reverseString("reverse"));
    }

    public static void factorial() {
        System.out.println(FCC.factorial(7));
    }

    public static void findLargestString() {
        System.out.println(FCC.findLargestString("The largest string is humongous left foot."));
    }

    public static void arrayOfLargest() {
        FCC.arrayOfLargest(new int[][]{{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}});
    }

    public static void cToF() {
        System.out.println(FCC.cToF(10));


    }

    public static void confirmTheEnding() {
        System.out.println(FCC.confirmTheEnding("Open sesame", "same"));


    }
}
