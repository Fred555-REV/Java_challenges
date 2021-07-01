package Java_challenges;

import java.util.Scanner;

//This class is for working on and testing challenges

public class Test {

    //@SuppressWarnings({"unchecked", "deprecated"}
    @SuppressWarnings("ALL")// this is the best creation in all of JAVA

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter amount of time conversions.");
//        int n = scan.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter integer to convert.");
//            int initialTime = scan.nextInt();
//            System.out.println(Edabit.convertTime(initialTime));
//        }
//        scan.close();

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
        Edabit.arrayofMultiples(7, 5);
        Edabit.arrayofMultiples(12, 10);
        Edabit.arrayofMultiples(17, 6);
    }

    public static void squarePatch() {
        Edabit.squarePatch(0);
        Edabit.squarePatch(1);
        Edabit.squarePatch(3);
        Edabit.squarePatch(5);
    }

    public static void reverseString() {
        System.out.println(FCC.reverseString("racecars"));
        System.out.println(FCC.reverseString("reverse"));
    }

    public static void factorial() {
        System.out.println(FCC.factorial(7));
    }

    public static void findLargestString() {
        System.out.println(FCC.findLargestString("The largest string is humongous left foot."));
        System.out.println(FCC.findLargestString("airplane aeronautics accent accident axe air"));
    }

    public static void arrayOfLargest() {
        FCC.arrayOfLargest(new int[][]{{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}});
        FCC.arrayOfLargest(new int[][]{{4, 9, 1, 3}, {13, 35, 18, 26}, {32, 35, 97, 39}, {1000000, 1001, 857, 1}});
    }

    public static void cToF() {
        System.out.println(FCC.cToF(10));
        System.out.println(FCC.cToF(24));

    }

    public static void confirmTheEnding() {
        System.out.println(FCC.confirmTheEnding("Open sesame", "same"));
        System.out.println(FCC.confirmTheEnding("what's in the box? nothing", "mountain"));
        System.out.println(FCC.confirmTheEnding("Abstraction", "action"));
        System.out.println(FCC.confirmTheEnding("Chicken is amazing", "Chicken"));

    }
}
//    public static void name() {
//
//
//    }