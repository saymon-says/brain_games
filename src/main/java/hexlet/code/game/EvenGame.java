package hexlet.code.game;

import java.util.Scanner;

public class EvenGame {

    private static boolean evenNumber;
    private static int flag = 0;
    private static final int LOOPS = 3;

    public static String getAnswerEvenGame() {
        int number = Engine.getRandomNumber();
        evenNumber = number % 2 == 0;
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static void checkAnswerEvenGame(String answer, String person) {
        if (Engine.correctInput(answer)) {
            if (evenNumber && answer.equals("yes") || (!evenNumber && answer.equals("no"))) {
                System.out.println("Correct!");
                flag++;
                if (flag < LOOPS) {
                    checkAnswerEvenGame(getAnswerEvenGame(), person);
                } else {
                    Engine.congratulation(person);
                }
            } else if (evenNumber && answer.equals("no")) {
                Engine.incorrectInput(answer, "yes", person);
            } else if (!evenNumber && answer.equals("yes")) {
                Engine.incorrectInput(answer, "no", person);
            }
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. \n"
                    + "Let's try again " + person + "!");
        }
    }
}
