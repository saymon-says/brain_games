package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class EvenGame {

    private static boolean isEvenNumber;

    public static String getAnswerEvenGame() {
        int number = Engine.getRandomNumber();
        isEvenNumber = number % 2 == 0;
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static boolean checkAnswerEvenGame(String answer, String person) {
        if (isCheckAnswerEvenGame(answer)) {
            return true;
        }
        if (isEvenNumber && answer.equals("no")) {
            Engine.incorrectInput(answer, "yes", person);
        }
        if (!isEvenNumber && answer.equals("yes")) {
            Engine.incorrectInput(answer, "no", person);
        }
        return false;
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

    private static boolean isCheckAnswerEvenGame(String answer) {
        return isEvenNumber && answer.equals("yes") || !isEvenNumber && answer.equals("no");
    }
}
