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
        System.out.println("Your choice - " + choice + "\n");
    }

    public static void outputTextQuestions(final String output) {
        System.out.println("Question: " + output);
    }

    public static void outputTextGameMessage(final String text) {
        System.out.println(text);
    }

    public static void outputTextCongratulation(final String person) {
        System.out.println("Congratulations, " + person + "!");
    }

    public static void outputNamePerson() {
        System.out.print("May I have your name? ");
        name = Cli.getName();
        System.out.printf("Hello, %s!\n", name);
    }

    public static void outputTextIncorrectInput(final String yourInput,
                                                final String correctInput,
                                                final String person) {
        System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n"
                + "Let's try again, %s!\n", yourInput, correctInput, person);
    }

    public static void outputTextWrongAnswer(final String answer,
                                             final String person) {
        System.out.printf("%s is wrong answer ;(.\n Let's tyr again %s!%n\n", answer, person);
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

    public static String getName() {
        return name;
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(FACTOR + 1);
    }

    /*
    Game logic
     */

    public static boolean isCorrectInput(final String input) {
        return input.equals("yes") || input.equals("no");
    }

    public static String getStringAnswerAndOutMessage(final String variable) {
        outputTextQuestions(variable);
        outputTextGameMessage(ANSWER);
        return inputStringAnswer();
    }

    public static boolean isCheckInput(final String answer,
                                       final String person) {
        if (isCorrectInput(answer)) {
            return false;
        } else {
            outputTextWrongAnswer(answer, person);
            return true;
        }
    }

    public static boolean isCheckAnswer(final boolean variable,
                                        final String answer,
                                        final String person) {
        if (variable && answer.equals("yes") || !variable && answer.equals("no")) {
            return false;
        }
        if (variable && answer.equals("no")) {
            Engine.outputTextIncorrectInput(answer, "yes", person);
        }
        if (!variable && answer.equals("yes")) {
            Engine.outputTextIncorrectInput(answer, "no", person);
        }
        return true;
    }

    public static boolean isCheckIntegerAnswer(final int variable,
                                               final String answer,
                                               final String person) {
        if (String.valueOf(variable).equals(answer)) {
            return false;
        } else {
            Engine.outputTextIncorrectInput(String.valueOf(answer), String.valueOf(variable), person);
            return true;
        }
    }
}
