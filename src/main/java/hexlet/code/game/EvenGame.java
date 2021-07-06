package hexlet.code.game;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.LOOPS;


public class EvenGame {

    private static final String EVEN_GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'\n";

    public static void startEvenGame() {
        Engine.gameLoops(getArrayOfValues(), EVEN_GAME_RULES);
    }

    private static String getCorrectAnswer(final boolean primeNumber) {
        return (primeNumber) ? "yes" : "no";
    }

    private static HashMap<String, String> getArrayOfValues() {
        Map<String, String> values = new HashMap<>();
        for (int i = 0; i < LOOPS; i++) {
            int variable = Engine.getRandomNumber() * Engine.getRandomNumber();
            boolean isEvenNumber = isNumberEven(variable);
            values.put(String.valueOf(variable), getCorrectAnswer(isEvenNumber));
        }
        return (HashMap<String, String>) values;
    }

    private static boolean isNumberEven(final int number) {
        return number % 2 == 0;
    }
}
