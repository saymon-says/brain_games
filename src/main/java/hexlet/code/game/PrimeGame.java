package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class PrimeGame {

    private static boolean primeNumber;
    private static final int CYCLE_IS_PRIME = 3;
    private static final double RANGE_START = 0.1;

    public static String getAnswerPrimeGame() {
        int variable = Engine.getRandomNumber();
        primeNumber = isPrime(variable);
        System.out.println("Question: " + variable);
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static boolean checkAnswerPrimeGame(String answer, String person) {

        if (isCheckAnswerPrimeGame(answer)) {
            return true;
        }
        if (primeNumber && answer.equals("no")) {
            Engine.incorrectInput(answer, "yes", person);
        }
        if (!primeNumber && answer.equals("yes")) {
            Engine.incorrectInput(answer, "no", person);
        }
        return false;
    }

    private static boolean isPrime(final int number) {
        if (number != 2 && number % 2 == 0) {
            return false;
        }

        if (number == 1) {
            return false;
        }

        int limit = (int) (RANGE_START + Math.sqrt(number));
        for (int i = CYCLE_IS_PRIME; i <= limit; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInputPrimeGame(String answer, String person) {
        if (Engine.correctInput(answer)) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. \n"
                    + "Let's try again " + person + "!");
            return false;
        }
    }

    private static boolean isCheckAnswerPrimeGame(String answer) {
        return primeNumber && answer.equals("yes") || !primeNumber && answer.equals("no");
    }
}
