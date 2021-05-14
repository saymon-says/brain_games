package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class ProgressionGame {

    private static final int LOOPS = 3;
    private static int flag;
    private static int temp;
    private static int shadowTemp;
    private static final int COUNT_STEP = 10;


    public static int getAnswerProgressionGame() {
        int firstNumber = Engine.getRandomNumber();
        int progressionStep = Engine.getRandomNumber();
        int shadowNumber = Engine.getRandomNumber();
        temp = firstNumber;

        System.out.println("Question: "
                + getProgressionLane(firstNumber, progressionStep, shadowNumber));
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void checkAnswerProgressionGame(int answer, String person) {
        if (shadowTemp == answer) {
            System.out.println("Correct!");
            flag++;
            if (flag < LOOPS) {
                checkAnswerProgressionGame(getAnswerProgressionGame(), person);
            } else {
                Engine.congratulation(person);
            }
        } else {
            Engine.incorrectInput("" + answer, "" + shadowTemp, person);
        }
    }

    public static String getProgressionLane(int start, int step, int shadow) {
        temp = start;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= COUNT_STEP; i++) {
            if (i == shadow) {
                shadowTemp = temp;
                temp = temp + step;
                sb.append("..");
                sb.append(" ");
            } else {
                sb.append(temp);
                sb.append(" ");
                temp = temp + step;
            }
        }
        return sb.toString();
    }


}
