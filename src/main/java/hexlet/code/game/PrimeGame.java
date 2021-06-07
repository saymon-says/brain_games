package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.LOOPS;

public class PrimeGame {

    private static final int CYCLE_IS_PRIME = 3;
    private static final double RANGE_START = 0.1;

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

    public static void primeGameLoops(final String person) {
        for (int i = 0; i < LOOPS; i++) {
            int variable = Engine.getRandomNumber();
            boolean primeNumber = isPrime(variable);
            String answer = Engine.getStringAnswer(String.valueOf(variable));
            if (Engine.isCheckStringAnswer(primeNumber, answer, person)
                    || Engine.isCheckInput(answer, person)) {
                return;
            }
            Engine.outputIfAnswerCorrect();
        }
        Engine.outputTextCongratulation(person);
    }
}
