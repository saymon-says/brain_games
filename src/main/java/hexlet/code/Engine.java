package hexlet.code;

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

    public static void outputTextWrongAnswer(final String answer) {
        System.out.printf("%s is wrong answer ;(.\n Let's tyr again %s!%n\n", answer, name);
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
    public static String getStringAnswerAndOutMessage(final String variable) {
        outputTextQuestions(variable);
        outputTextGameMessage(ANSWER);
        return inputStringAnswer();
    }

    public static boolean isCorrectInput(final String input) {
        return input.equals("yes") || input.equals("no");
    }

    public static boolean isCheckInputOrWriteMsg(final String answer) {
        if (isCorrectInput(answer)) {
            return false;
        } else {
            outputTextWrongAnswer(answer);
            return true;
        }
    }

    public static boolean isCheckAnswerOrWriteMsg(final boolean variable,
                                                  final String answer) {
        if (variable && answer.equals("yes") || !variable && answer.equals("no")) {
            return false;
        }
        if (variable && answer.equals("no")) {
            outputTextIncorrectInput(answer, "yes");
        }
        if (!variable && answer.equals("yes")) {
            outputTextIncorrectInput(answer, "no");
        }
        return true;
    }

    public static boolean checkAnswerOrWriteMsg(final String variable,
                                                final String answer) {
        if (variable.equals(answer)) {
            return false;
        } else {
            outputTextIncorrectInput(answer, variable);
            return true;
        }
    }
}
