package Java_challenges;

import java.util.Locale;

public class NoInput {
    public static void run(int index) {
        switch (index) {
            case 0:
                arrayOfMultiples();
                break;
            case 1:
                countBoomerangs();
                break;
            case 2:
                squarePatch();
                break;
            case 3:
                sevenBoom();
                break;
            case 4:
                convertTime();
                break;
            case 5:
                mapping();
                break;
            case 6:
                reverseString();
                break;
            case 7:
                factorial();
                break;
            case 8:
                findLargestString();
                break;
            case 9:
                arrayOfLargest();
                break;
            case 10:
                cToF();
                break;
            case 11:
                confirmTheEnding();
                break;
        }
    }

    public static void mapping() {
        String[] arr1 = new String[]{"x", "a", "v", "i", "e", "r"};
        String[] arr2 = new String[]{"t", "e", "s", "h", "a"};
        String[] arr3 = new String[]{"a", "b", "c"};
        System.out.println("input is: xavier");
        Edabit.mapping(arr1);
        System.out.println("input is: tesha");
        Edabit.mapping(arr2);
        System.out.println("input is: abc");
        Edabit.mapping(arr3);
    }

    public static void sevenBoom() {
        int[] numArr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] numArr2 = new int[]{8, 6, 33, 100};
        int[] numArr3 = new int[]{2, 55, 60, 97, 86};
        System.out.println("input is: 1, 2, 3, 4, 5, 6, 7");
        System.out.println(Edabit.sevenBoom(numArr1));// yes
        System.out.println("input is: 8, 6, 33, 100");
        System.out.println(Edabit.sevenBoom(numArr2));// no
        System.out.println("input is: 2, 55, 60, 97, 86");
        System.out.println(Edabit.sevenBoom(numArr3));// yes
    }

    public static void countBoomerangs() {
        int[] arrBoom1 = {9, 5, 9, 5, 1, 1, 1};
        int[] arrBoom2 = {5, 6, 6, 7, 6, 3, 9};
        int[] arrBoom3 = {4, 4, 4, 9, 9, 9, 9};

        System.out.println("input is: 9, 5, 9, 5, 1, 1, 1");
        Edabit.countBoomerangs(arrBoom1);// ➞ 2
        System.out.println("input is: 5, 6, 6, 7, 6, 3, 9");
        Edabit.countBoomerangs(arrBoom2);// ➞ 1
        System.out.println("input is: 4, 4, 4, 9, 9, 9, 9");
        Edabit.countBoomerangs(arrBoom3);// ➞ 0
    }

    public static void arrayOfMultiples() {
        System.out.println("Input is: 7 , 5");
        Edabit.arrayofMultiples(7, 5);
        System.out.println("Input is: 12 , 10");
        Edabit.arrayofMultiples(12, 10);
        System.out.println("Input is: 17 , 6");
        Edabit.arrayofMultiples(17, 6);
    }

    public static void squarePatch() {
        System.out.println("Input is: 0");
        Edabit.squarePatch(0);
        System.out.println("Input is: 1");
        Edabit.squarePatch(1);
        System.out.println("Input is: 3");
        Edabit.squarePatch(3);
        System.out.println("Input is: 5");
        Edabit.squarePatch(5);
    }

    public static int convertTime() {
        int initialTime = (int) Math.floor(Math.random() * 3) + 1;
        System.out.println("input is " + initialTime + " , the time converted from is days and converted to is minutes.");
        String fromTime = "day";
        String toTime = "minute";
        switch (fromTime.toLowerCase(Locale.ROOT)) {
            case "second":
            case "seconds":
                switch (toTime.toLowerCase(Locale.ROOT)) {
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
                switch (toTime.toLowerCase(Locale.ROOT)) {
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
                switch (toTime.toLowerCase(Locale.ROOT)) {
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
                switch (toTime.toLowerCase(Locale.ROOT)) {
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
                switch (toTime.toLowerCase(Locale.ROOT)) {
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
                switch (toTime.toLowerCase(Locale.ROOT)) {
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
                switch (toTime.toLowerCase(Locale.ROOT)) {
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
        System.out.println("Input is: racecars");
        System.out.println(FCC.reverseString("racecars"));
        System.out.println("Input is: The largest string is humongous left foot.");
        System.out.println(FCC.reverseString("reverse"));
    }

    public static void factorial() {
        System.out.println(FCC.factorial(7));
    }

    public static void findLargestString() {
        System.out.println("Input is: The largest string is humongous left foot.");
        System.out.println(FCC.findLargestString("The largest string is humongous left foot."));
        System.out.println("Input is: airplane aeronautics accent accident axe air");
        System.out.println(FCC.findLargestString("airplane aeronautics accent accident axe air"));
    }

    public static void arrayOfLargest() {
        System.out.println("Input is: {{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}}");
        FCC.arrayOfLargest(new int[][]{{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}});
        System.out.println("Input is: {{4, 9, 1, 3}, {13, 35, 18, 26}, {32, 35, 97, 39}, {1000000, 1001, 857, 1}}");
        FCC.arrayOfLargest(new int[][]{{4, 9, 1, 3}, {13, 35, 18, 26}, {32, 35, 97, 39}, {1000000, 1001, 857, 1}});
    }

    public static void cToF() {
        System.out.println("Input is: 10");
        System.out.println(FCC.cToF(10));
        System.out.println("Input is: 24");
        System.out.println(FCC.cToF(24));

    }

    public static void confirmTheEnding() {
        System.out.println("Input is: Open sesame, same");
        System.out.println(FCC.confirmTheEnding("Open sesame", "same"));
        System.out.println("Input is: what's in the box ? nothing, mountain");
        System.out.println(FCC.confirmTheEnding("what's in the box ? nothing", "mountain"));
        System.out.println("Input is: Abstraction, action");
        System.out.println(FCC.confirmTheEnding("Abstraction", "action"));
        System.out.println("Input is: Chicken is amazing, Chicken");
        System.out.println(FCC.confirmTheEnding("Chicken is amazing", "Chicken"));

    }
}
