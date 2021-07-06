package hexlet.code.game;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.LOOPS;

public class ProgressionGame {

    private static String shadowTempProgressionElement;
    private static final int COUNT_STEP = 10;
    private static final String PROGRESSIVE_GAME_RULES = "What number is missing in the progression?\n";

    public static void startProgressiveGame() {
        Engine.gameLoops(getArrayOfValues(), PROGRESSIVE_GAME_RULES);
    }

    public static String getProgressionLane() {
        int firstNumber = Engine.getRandomNumber();
        int progressionStep = Engine.getRandomNumber() + 1;
        int shadowNumber = Engine.getRandomNumber();
        int tempProgressionElement = firstNumber;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= COUNT_STEP; i++) {
            if (i == shadowNumber) {
                shadowTempProgressionElement = String.valueOf(tempProgressionElement);
                tempProgressionElement = tempProgressionElement + progressionStep;
                sb.append("..");
                sb.append(" ");
            } else {
                sb.append(tempProgressionElement);
                sb.append(" ");
                tempProgressionElement = tempProgressionElement + progressionStep;
            }
        }
        return sb.toString();
    }

    private static HashMap<String, String> getArrayOfValues() {
        Map<String, String> values = new HashMap<>();
        for (int i = 0; i < LOOPS; i++) {
            values.put(getProgressionLane(), shadowTempProgressionElement);
        }
        return (HashMap<String, String>) values;
    }
}
