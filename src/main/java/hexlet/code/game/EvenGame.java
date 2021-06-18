package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT;
import static hexlet.code.Engine.LOOPS;


public class EvenGame {

    private static final String EVEN_GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'\n";

    public static void startEvenGame() {
        Engine.outputStartInfoGame();
        Engine.outputTextGameMessage(EVEN_GAME_RULES);
        evenGameLoops(Engine.getName());
    }

    public static void evenGameLoops(final String person) {
        for (int i = 0; i < LOOPS; i++) {
            int number = Engine.getRandomNumber();
            boolean isEvenNumber = isNumberEven(number);
            String answer = Engine.getStringAnswerAndOutMessage(String.valueOf(number));
            if (Engine.isCheckInput(answer, person)
                    || Engine.isCheckStringAnswer(isEvenNumber, answer, person)) {
                return;
            }
            Engine.outputTextGameMessage(CORRECT);
        }
        Engine.outputTextCongratulation(person);
    }

    private static boolean isNumberEven(final int number) {
        return number % 2 == 0;
    }
}
