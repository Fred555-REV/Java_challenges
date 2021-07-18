package Java_challenges;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Display {
    private static List<String> challenges;
    private static List<String> challengeGoals;

    public static List<String> createList() {
        challenges = new ArrayList<>();
        return challenges;
    }

    public static List<String> createGoalList() {
        challengeGoals = new ArrayList<>();
        return challengeGoals;
    }

    public static List<String> getChallenges() {
        return challenges;
    }

    public static List<String> getChallengeGoals() {
        return challengeGoals;
    }

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public static void addList() {
        createList();
        challenges.add("arrayOfMultiples");
        challenges.add("countBoomerangs");
        challenges.add("squarePatch");
        challenges.add("sevenBoom");
        challenges.add("convertTime");
        challenges.add("mapping");
        challenges.add("reverseString");
        challenges.add("factorial");
        challenges.add("findLargestString");
        challenges.add("arrayOfLargest");
        challenges.add("cToF");
        challenges.add("confirmTheEnding");
//        challenges.add("");
//        challenges.add("");
//        challenges.add("");
//        challenges.add("");
//        challenges.add("");
//        challenges.add("");
    }

    public static void addGoalList() {
        createGoalList();
        challengeGoals.add("Creates an array that stores a given numbers multiples up to a second given number.");
        challengeGoals.add("Counts the amount of times two equal numbers surrounds one number that is not equal to the other two numbers.");
        challengeGoals.add("Creates an array that takes the form of a square with the sides lengths being a given number.");
        challengeGoals.add("If any digit in an array is a seven a BOOM! will be outputted.");
        challengeGoals.add("Converts time from and to seconds/minutes/hours/days/weeks/months/years");
        challengeGoals.add("Creates a map that outputs lowercase letters with their uppercase equivalent.");
        challengeGoals.add("Reverses a string.");
        challengeGoals.add("Creates and solves a factorial of a given number.");
        challengeGoals.add("Finds the largest string in a sentence.");
        challengeGoals.add("arrayOfLargest");
        challengeGoals.add("Converts celsius to Fahrenheit");
        challengeGoals.add("Confirms the ending of a String or sentence.");
    }

    public static void challengeNames() {
        addList();
        addGoalList();
        getChallenges();
        for (String challenge : challenges) {
            System.out.println(challenge);
        }
        System.out.println("---------------------------");
    }

    public static void challengeList() {
        getChallenges();
        for (int i = 0; i < challenges.size(); i++) {
            System.out.println("Challenge: " + challenges.get(i) + " index : " + i);
        }
    }

    public static void challengeGoals() {
        getChallenges();
        getChallengeGoals();
        for (int i = 0; i < challenges.size(); i++) {
            System.out.println(challenges.get(i) + " <===> " + challengeGoals.get(i));
        }

    }

    public static void challengeOrder() {
        getChallenges();
        for (int i = 0; i < challenges.size(); i++) {
            System.out.println("Challenge: " + challenges.get(i) + " Index: " + i);
        }
    }

    public static void clearConsole() {
        System.out.println(System.lineSeparator().repeat(100));
    }

}
