package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;

import static hexlet.code.Engine.*;

public class GcdGame {

    private static int firstNumber;
    private static int secondNumber;

    public static void startGcdGame() {
        outputStartInfoGame();
        outputGameGcdRules();
        GcdGame.gcdGameLoops(name);
    }

    private static String getSetDigits() {
        firstNumber = Engine.getRandomNumber();
        secondNumber = Engine.getRandomNumber();
        return String.format("%d %d", firstNumber, secondNumber);
    }

    private static int findGcd(final int a,
                               final int b) {
        BigInteger c = BigInteger.valueOf(a);
        BigInteger d = BigInteger.valueOf(b);
        return (c.gcd(d)).intValue();
    }

    public static void gcdGameLoops(final String person) {
        for (int i = 0; i < LOOPS; i++) {
            int answer = Engine.getIntAnswer(getSetDigits());
            if (Engine.isCheckIntegerAnswer(findGcd(firstNumber, secondNumber), answer, person)) {
                return;
            }
            Engine.outputIfAnswerCorrect();
        }
        Engine.outputTextCongratulation(person);
    }
}
