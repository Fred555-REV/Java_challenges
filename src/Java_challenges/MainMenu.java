package Java_challenges;

import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to Java Challenges.");
        System.out.println("Would you like to look at some challenges? y / n");
        String challYorN = scan.nextLine();
        if (challYorN.equalsIgnoreCase("y")) {
            Display.challengeNames();
        } else {
            System.out.println("WRONG");
            MainMenu.main(args);
        }

        System.out.println("Would you like to see what a challenge's goal is?\n");
        System.out.println("yes/no");
        String response = scan.nextLine();
        if (response.compareToIgnoreCase("yes") != 0) {
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
        }
        Display.challengeGoals();

        System.out.println("Would you like to make inputs or use prepared code? a / b / none");
        String inputsPrepared = scan.nextLine();
        if (inputsPrepared.equalsIgnoreCase("a")) {
            System.out.println("Area under construction come back later.");
            MainMenu.main(null);
        } else if (inputsPrepared.equalsIgnoreCase("b")) {
            Display.challengeOrder();
            System.out.println("Choose by index");
            int noInputI = scan.nextInt();
            Test.run(noInputI);

        } else {
            System.out.println("No no no...");
            MainMenu.main(null);
        }


    }
}
