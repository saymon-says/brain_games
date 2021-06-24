package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;

import static hexlet.code.Engine.CORRECT;
import static hexlet.code.Engine.LOOPS;

public class GcdGame {

    private static int firstNumber;
    private static int secondNumber;
    private static final String GCD_GAME_RULES = "Find the greatest common divisor of given numbers.\n";

    public static void startGcdGame() {
        Engine.outputStartInfoGame();
        Engine.outputTextGameMessage(GCD_GAME_RULES);
        GcdGame.gcdGameLoops(Engine.getName());
    }

    private static String getSetDigits() {
        firstNumber = Engine.getRandomNumber();
        secondNumber = Engine.getRandomNumber();
        return String.format("%d %d", firstNumber, secondNumber);
    }

    private static int findGcd(final int a, final int b) {
        BigInteger c = BigInteger.valueOf(a);
        BigInteger d = BigInteger.valueOf(b);
        return (c.gcd(d)).intValue();
    }

    public static void gcdGameLoops(final String person) {
        for (int i = 0; i < LOOPS; i++) {
            String answer = Engine.getStringAnswerAndOutMessage(getSetDigits());
            if (Engine.isCheckIntegerAnswer(findGcd(firstNumber, secondNumber), answer, person)) {
                return;
            }
            Engine.outputTextGameMessage(CORRECT);
        }
        Engine.outputTextCongratulation(person);
    }
}
