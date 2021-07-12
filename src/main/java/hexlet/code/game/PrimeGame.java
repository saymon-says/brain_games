package hexlet.code.game;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.LOOPS;

public class PrimeGame {

    private static final int START_DIVIDER = 5;
    private static final int THIRD = 3;
    private static final int STEP_DIVIDER = 6;
    private static final String PRIME_GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";

    public static void startPrimeGame() {
        Engine.gameLoops(getArrayOfValues(), PRIME_GAME_RULES);
    }

    private static boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        }

        if (number % 2 == 0) {
            return number == 2;
        }

        if (number % THIRD == 0) {
            return number == THIRD;
        }
        for (int i = START_DIVIDER; i * i < number; i += STEP_DIVIDER) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static String getCorrectAnswer(final boolean primeNumber) {
        return (primeNumber) ? "yes" : "no";
    }

    private static Map<String, String> getArrayOfValues() {
        Map<String, String> values = new HashMap<>();
        for (int i = 0; i < LOOPS; i++) {
            int variable = Engine.getRandomNumber() * Engine.getRandomNumber();
            boolean primeNumber = isPrime(variable);
            values.put(String.valueOf(variable), getCorrectAnswer(primeNumber));
        }
        return values;
    }
}
