package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class CalcGame {

    private static int flag = 0;
    private static final int LOOPS = 3;
    private static int resultCalc;

    public static int getAnswerCalcGame() {
        System.out.println("Question: " + calcOutput());
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void checkAnswerCalcGame(int answer, String person) {
        if (resultCalc == answer) {
            System.out.println("Correct!");
            flag++;
            if (flag < LOOPS) {
                checkAnswerCalcGame(getAnswerCalcGame(), person);
            } else {
                Engine.congratulation(person);
            }
        } else {
            Engine.incorrectInput("" + answer, "" + resultCalc, person);
        }
    }

    private static String calcOutput() {
        int a = Engine.getRandomNumber();
        int b = Engine.getRandomNumber();
        String operation = Engine.getRandomOperation();

        if (operation.equals(" + ")) {
            resultCalc = a + b;
        } else if (operation.equals(" - ")) {
            resultCalc = a - b;
        } else {
            resultCalc = a * b;
        }
        return a + operation + b;
    }
}
