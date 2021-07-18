package Java_challenges;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static Scanner scan = new Scanner(System.in);

    public static void run(int index) {
        Display.getChallengeGoals().get(index);
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
        System.out.println("Enter amount of letters to map.");
        int charAmount = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[charAmount];
        for (int i = 0; i < charAmount; i++) {
            System.out.println("Enter lowercase letter " + (i + 1));
            arr[i] = scan.next();
        }
        System.out.println(Edabit.mapping(arr));
    }

    public static void sevenBoom() {
        System.out.println("enter 7, 1-3 digit numbers");
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            scan.nextLine();
        }
        System.out.println(Edabit.sevenBoom(arr));// yes
    }

    public static void countBoomerangs() {
        int[] arr = new int[9];
        System.out.println("enter 9, 1 digit numbers with at least one \"boomerang\" ex. 121 or 313");
        for (int i = 0; i < arr.length; i++) {
            int num = scan.nextInt();
            scan.nextLine();
            arr[i] = num;
        }
        Edabit.countBoomerangs(arr);
    }

    public static void arrayOfMultiples() {
        System.out.println("Enter initial number.");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter length of array.");
        int length = scan.nextInt();
        scan.nextLine();
        Edabit.arrayofMultiples(num, length);
    }

    public static void squarePatch() {
        System.out.println("Enter amount of square patches");
        int amount = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < amount; i++) {
            int num = scan.nextInt();
            Edabit.squarePatch(num);
            scan.nextLine();
        }
    }

    public static void convertTime() {
        System.out.println("Enter an integer as initial time");
        int initialTime = scan.nextInt();
        scan.nextLine();
        System.out.println(Edabit.convertTime(initialTime));
    }

    public static void reverseString() {
        System.out.println("Enter string to reverse");
        String reverse = scan.next();
        System.out.println(FCC.reverseString(reverse));
    }

    public static void factorial() {
        System.out.println("Enter number to create factorial.");
        int factorial = scan.nextInt();
        scan.nextLine();
        System.out.println(FCC.factorial(factorial));
    }

    public static void findLargestString() {
        System.out.println("Enter sentence with no punctuation");
        String sentence = scan.nextLine();
        System.out.println(FCC.findLargestString(sentence));
    }

    public static void arrayOfLargest() {
        int[][] outerArr = new int[4][];
        for (int i = 0; i < 4; i++) {
            int[] innerArr = new int[4];
            System.out.println("Enter 4 numbers for array " + (i + 1) + "/4");
            for (int j = 0; j < 4; j++) {
                innerArr[j] = scan.nextInt();
                scan.nextLine();
            }
            outerArr[i] = innerArr;
        }
//                {{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}}
        FCC.arrayOfLargest(outerArr);
    }

    public static void cToF() {
        System.out.println("Enter Celsius degree");
        int celcius = scan.nextInt();
        scan.nextLine();
        System.out.println(FCC.cToF(celcius));

    }

    public static void confirmTheEnding() {
        System.out.println("Enter string");
        String str = scan.nextLine();
        System.out.println("Enter last word or letters of the string");
        String ending = scan.nextLine();
        System.out.println(FCC.confirmTheEnding(str, ending));


    }
}
