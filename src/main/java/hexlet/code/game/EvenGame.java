package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.LOOPS;

public class EvenGame {

    private static boolean isEvenNumber;
    private static int i = 0;

    public static String getAnswerEvenGame() {
        int number = Engine.getRandomNumber();
        isEvenNumber = number % 2 == 0;
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static void checkAnswerEvenGame(String answer, String person) {
        if (isEvenNumber && answer.equals("yes") || (!isEvenNumber && answer.equals("no"))) {
            System.out.println("Correct!");
        } else if (isEvenNumber && answer.equals("no")) {
            Engine.incorrectInput(answer, "yes", person);
        } else if (!isEvenNumber && answer.equals("yes")) {
            Engine.incorrectInput(answer, "no", person);
        }
    }

    public static boolean checkInputEvenGame(String answer, String person) {
        if (Engine.correctInput(answer)) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. \n"
                    + "Let's try again " + person + "!");
            return false;
        }
    }
}
