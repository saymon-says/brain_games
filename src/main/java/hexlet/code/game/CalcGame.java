package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;

public class CalcGame {

    private static int resultCalc;

    public static void startCalcGame() {
        outputStartInfoGame();
        outputGameCalcRules();
        calcGameLoops(name);
    }

    private static String calcOutput() {
        int a = Engine.getRandomNumber();
        int b = Engine.getRandomNumber();
        String operation = Engine.getRandomOperation();

        if (operation.equals(" + ")) {
            resultCalc = a + b;
        } else if (operation.equals(" - ")) {
            resultCalc = a - b;
        } else {
            resultCalc = a * b;
        }
        return a + operation + b;
    }

    public static void calcGameLoops(final String person) {
        for (int i = 0; i < LOOPS; i++) {
            int answer = Engine.getIntAnswer(calcOutput());
            if (Engine.isCheckIntegerAnswer(resultCalc, answer, person)) {
                return;
            }
            Engine.outputIfAnswerCorrect();
        }
        Engine.outputTextCongratulation(person);
    }
}
