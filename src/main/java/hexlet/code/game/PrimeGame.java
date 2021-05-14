package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeGame {

    private static boolean primeNumber;
    private static int flag = 0;
    private static final int LOOPS = 3;

    public static String getAnswerPrimeGame() {
        int variable = Engine.getRandomNumber();
        primeNumber = isPrime(variable);
        System.out.println("Question: " + variable);
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static void checkAnswerPrimeGame(String answer, String person) {
        if (Engine.correctInput(answer)) {
            if (primeNumber && answer.equals("yes") || (!primeNumber && answer.equals("no"))) {
                System.out.println("Correct!");
                flag++;
                if (flag < LOOPS) {
                    checkAnswerPrimeGame(getAnswerPrimeGame(), person);
                } else {
                    Engine.congratulation(person);
                }
            } else if (primeNumber && answer.equals("no")) {
                Engine.incorrectInput(answer, "yes", person);
            } else if (!primeNumber && answer.equals("yes")) {
                Engine.incorrectInput(answer, "no", person);
            }
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. \n"
                    + "Let's try again " + person + "!");
        }
    }

    private static boolean isPrime(final int number) {
        if (number == 1 || number == 2) {
            return true;
        }
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }


}
