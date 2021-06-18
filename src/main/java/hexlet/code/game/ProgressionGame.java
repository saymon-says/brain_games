package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT;
import static hexlet.code.Engine.LOOPS;

public class ProgressionGame {

    private static int shadowTempProgressionElement;
    private static final int COUNT_STEP = 10;
    private static final String PROGRESSIVE_GAME_RULES = "What number is missing in the progression?\n";

    public static void startProgressiveGame() {
        Engine.outputStartInfoGame();
        Engine.outputTextGameMessage(PROGRESSIVE_GAME_RULES);
        ProgressionGame.progressionGameLoops(Engine.getName());
    }

    public static String getProgressionLane() {
        int firstNumber = Engine.getRandomNumber();
        int progressionStep = Engine.getRandomNumber() + 1;
        int shadowNumber = Engine.getRandomNumber();
        int tempProgressionElement = firstNumber;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= COUNT_STEP; i++) {
            if (i == shadowNumber) {
                shadowTempProgressionElement = tempProgressionElement;
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

    public static void progressionGameLoops(final String person) {
        for (int i = 0; i < LOOPS; i++) {
            String answer = Engine.getStringAnswerAndOutMessage(getProgressionLane());
            if (Engine.isCheckIntegerAnswer(shadowTempProgressionElement, answer, person)) {
                return;
            }
            Engine.outputTextGameMessage(CORRECT);
        }
        Engine.outputTextCongratulation(person);
    }
}
