package hexlet.code;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int LOOPS = 3;
    public static final String ANSWER = "Your answer: ";
    public static final String GOOD_BYE = "Goodbye my friend's!";
    public static final String WELCOME = "Welcome To The Brain Games!";
    public static final String CORRECT = "Correct!";

    private static final int FACTOR = 10;
    private static String name;

    /*
    Output data
     */

    public static void outputYourChoice(final String choice) {
        System.out.printf("Your choice - %s\n", choice);
    }

    public static void outputTextQuestions(final String output) {
        System.out.printf("Question: %s\n", output);
    }

    public static void outputTextGameMessage(final String text) {
        System.out.println(text);
    }

    public static void outputTextCongratulation() {
        System.out.printf("Congratulations, %s!\n", name);
    }

    public static void outputNamePerson() {
        System.out.print("May I have your name? ");
        name = Cli.getName();
        System.out.printf("Hello, %s!\n", name);
    }

    public static void outputTextIncorrectInput(final String yourInput,
                                                final String correctInput) {
        System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n"
                + "Let's try again, %s!\n", yourInput, correctInput, name);
    }

    public static void outputStartInfoGame() {
        outputTextGameMessage(WELCOME);
        outputNamePerson();
    }

    /*
    Input data
     */

    public static String inputStringAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    /*
    Engine Game Process
     */

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(FACTOR + 1);
    }

    /*
    Game logic
     */

    public static boolean isCheckKey(final Map<String, String> values, final String key) {
        if (values.size() != 0) {
            for (String keysOfMap : values.keySet()) {
                if (keysOfMap.equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void gameLoops(final Map<String, String> values, final String gameRules) {
        outputStartInfoGame();
        outputTextGameMessage(gameRules);
        for (Map.Entry<String, String> gameValues : values.entrySet()) {
            outputTextQuestions(gameValues.getKey());
            outputTextGameMessage(ANSWER);
            String answer = inputStringAnswer();
            if (answer.equals(gameValues.getValue())) {
                outputTextGameMessage(CORRECT);
            } else {
                outputTextIncorrectInput(answer, gameValues.getValue());
                return;
            }
        }
        outputTextCongratulation();
    }
}
