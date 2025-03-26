package Week3;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {
        int required = intInput("How many credits does your class require?");
        int earned = intInput("How many credits do you have?");
        int needed = howManyCreditsToGraduate(required, earned);
        System.out.println("You need " + needed + " credits.");
    }

    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) {
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;
    }
}
