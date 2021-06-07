package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.LOOPS;


public class EvenGame {

    public static void startEvenGame() {
        Engine.outputStartInfoGame();
        Engine.outputGameEvenRules();
        evenGameLoops(Engine.getName());
    }

    public static void evenGameLoops(final String person) {
        for (int i = 0; i < LOOPS; i++) {
            int number = Engine.getRandomNumber();
            boolean isEvenNumber = isNumberEven(number);
            String answer = Engine.getStringAnswer(String.valueOf(number));
            if (Engine.isCheckInput(answer, person)
                    || Engine.isCheckStringAnswer(isEvenNumber, answer, person)) {
                return;
            }
            Engine.outputIfAnswerCorrect();
        }
        Engine.outputTextCongratulation(person);
    }

    private static boolean isNumberEven(final int number) {
        return number % 2 == 0;
    }
}
