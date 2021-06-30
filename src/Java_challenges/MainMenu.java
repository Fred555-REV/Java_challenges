package Java_challenges;

import java.util.Locale;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to Java Challenges.");
        System.out.println("Would you like to look at some challenges? y / n");
        if (scan.nextLine().equalsIgnoreCase("y")) {
            Display.challengeNames();
        } else {
            System.out.println("WRONG");
            MainMenu.main(args);
        }
        System.out.println("Would you like to see what a challenge's goal is?\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("well you are going to see them anyways >:]\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Display.challengeGoals();
        System.out.println("Would you like to make inputs or use prepared code? a / b / none");
//        if (scan.nextLine().equalsIgnoreCase("a")) {
//
//        } else if (scan.nextLine().equalsIgnoreCase("b")) {
//
//        }


    }
}
