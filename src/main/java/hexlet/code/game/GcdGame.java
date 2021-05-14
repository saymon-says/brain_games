package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class GcdGame {

    private static int flag = 0;
    private static final int LOOPS = 3;
    private static int firstNumber;
    private static int secondNumber;

    public static int getAnswerGcdGame() {
        firstNumber = Engine.getRandomNumber();
        secondNumber = Engine.getRandomNumber();
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void checkAnswerGcdGame(int answer, String person) {
        int resultGcd = findGcd(firstNumber, secondNumber);
        if (answer == resultGcd) {
            System.out.println("Correct!");
            flag++;
            if (flag < LOOPS) {
                checkAnswerGcdGame(getAnswerGcdGame(), person);
            } else {
                Engine.congratulation(person);
            }
        } else {
            Engine.incorrectInput("" + answer, "" + resultGcd, person);
        }
    }

    private static int findGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
