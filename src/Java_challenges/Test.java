package Java_challenges;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//This class is for working on and testing challenges

public class Test {

    //@SuppressWarnings({"unchecked", "deprecated"}
    @SuppressWarnings("ALL")// this is the best creation in all of JAVA

    public static void main(String[] args) {
//        Edabit.sevenBoom(new int[]{1, 23, 34, 25, 57, 68, 79});
//        Scanner scan = new Scanner(System.in);
//
        // added for easier checking
        arrayOfMultiples();

        squarePatch();

        System.out.println();
        System.out.println();
        System.out.println(Edabit.specialReverseString("Edabit"));
        System.out.println(Edabit.specialReverseString("UPPER lower"));
        System.out.println(Edabit.specialReverseString("1 23 456"));
        System.out.println(Edabit.atBashCipher("apple"));
        System.out.println(Edabit.atBashCipher("Hello world!"));
        System.out.println(Edabit.atBashCipher("Christmas is the 25th of December"));
        //added decode method


    }
//   methods copied from noInput class
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
}
//    public static void name() {
//
//
//    }