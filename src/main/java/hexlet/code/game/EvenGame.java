package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT;
import static hexlet.code.Engine.LOOPS;


public class EvenGame {

    private static final String EVEN_GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'\n";

    public static void startEvenGame() {
        Engine.outputStartInfoGame();
        Engine.outputTextGameMessage(EVEN_GAME_RULES);
        evenGameLoops();
    }

    public static void evenGameLoops() {
        for (int i = 0; i < LOOPS; i++) {
            int number = Engine.getRandomNumber();
            boolean isEvenNumber = isNumberEven(number);
            String answer = Engine.getStringAnswerAndOutMessage(String.valueOf(number));
            if (Engine.isCheckInputOrWriteMsg(answer)
                    || Engine.isCheckAnswerOrWriteMsg(isEvenNumber, answer)) {
                return;
            }
            Engine.outputTextGameMessage(CORRECT);
        }
        Engine.outputTextCongratulation();
    }

    private static boolean isNumberEven(final int number) {
        return number % 2 == 0;
    }
}
