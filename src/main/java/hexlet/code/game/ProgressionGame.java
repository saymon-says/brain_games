package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class ProgressionGame {

    private static int tempProgressionElement;
    private static int shadowTempProgressionElement;
    private static final int COUNT_STEP = 10;


    public static int getAnswerProgressionGame() {
        int firstNumber = Engine.getRandomNumber();
        int progressionStep = Engine.getRandomNumber();
        int shadowNumber = Engine.getRandomNumber();
        tempProgressionElement = firstNumber;

        System.out.println("Question: "
                + getProgressionLane(firstNumber, progressionStep, shadowNumber));
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static boolean checkAnswerProgressionGame(int answer, String person) {
        if (shadowTempProgressionElement == answer) {
            return true;
        } else {
            Engine.incorrectInput("" + answer, ""
                    + shadowTempProgressionElement, person);
            return false;
        }
    }

    public static String getProgressionLane(int start, int step, int shadow) {
        tempProgressionElement = start;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= COUNT_STEP; i++) {
            if (i == shadow) {
                shadowTempProgressionElement = tempProgressionElement;
                tempProgressionElement = tempProgressionElement + step;
                sb.append("..");
                sb.append(" ");
            } else {
                sb.append(tempProgressionElement);
                sb.append(" ");
                tempProgressionElement = tempProgressionElement + step;
            }
        }
        return sb.toString();
    }


}
