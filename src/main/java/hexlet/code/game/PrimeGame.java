package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.LOOPS;

public class PrimeGame {

    private static final int START_DIVIDER = 5;
    private static final int THIRD = 3;
    private static final int STEP_DIVIDER = 6;

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
