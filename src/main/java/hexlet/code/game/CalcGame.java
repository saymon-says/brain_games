package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.CORRECT;
import static hexlet.code.Engine.LOOPS;

public class CalcGame {

    private static String resultCalc;
    private static final String CALC_GAME_RULES = "What is the result of the expression?\n";

    public static void startCalcGame() {
        Engine.outputStartInfoGame();
        Engine.outputTextGameMessage(CALC_GAME_RULES);
        calcGameLoops();
    }

    private static String calcOutput() {
        int a = Engine.getRandomNumber();
        int b = Engine.getRandomNumber();
        String operation = getRandomOperation();

        if (operation.equals(" + ")) {
            resultCalc = String.valueOf(a + b);
        } else if (operation.equals(" - ")) {
            resultCalc = String.valueOf(a - b);
        } else {
            resultCalc = String.valueOf(a * b);
        }
        return a + operation + b;
    }

    public static void calcGameLoops() {
        for (int i = 0; i < LOOPS; i++) {
            String answer = Engine.getStringAnswerAndOutMessage(calcOutput());
            if (Engine.checkAnswerOrWriteMsg(resultCalc, answer)) {
                return;
            }
            Engine.outputTextGameMessage(CORRECT);
        }
        Engine.outputTextCongratulation();
    }

    private static String getRandomOperation() {
        int numberOperation = new Random().nextInt(LOOPS);

        if (numberOperation == 0) {
            return " + ";
        } else if (numberOperation == 1) {
            return " - ";
        } else {
            return " * ";
        }
    }
}
