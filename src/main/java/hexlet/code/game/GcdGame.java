package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.LOOPS;

public class GcdGame {

    private static int firstNumber;
    private static int secondNumber;
    private static final String GCD_GAME_RULES = "Find the greatest common divisor of given numbers.\n";

    public static void startGcdGame() {
        Engine.gameLoops(getArrayOfValues(), GCD_GAME_RULES);
    }

    private static String getSetDigits() {
        firstNumber = Engine.getRandomNumber();
        secondNumber = Engine.getRandomNumber();
        return String.format("%d %d", firstNumber, secondNumber);
    }

    private static String findGcd(final int a, final int b) {
        BigInteger c = BigInteger.valueOf(a);
        BigInteger d = BigInteger.valueOf(b);
        return String.valueOf((c.gcd(d)).intValue());
    }

    private static Map<String, String> getArrayOfValues() {
        Map<String, String> values = new HashMap<>();
        for (int i = 0; i < LOOPS;) {
            String line = getSetDigits();
            if (!Engine.isCheckKey(values, line)) {
                values.put(line, findGcd(firstNumber, secondNumber));
                i++;
            }
        }
        return values;
    }
}
