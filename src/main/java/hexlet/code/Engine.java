package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int LOOPS = 3;
    private static final int FACTOR = 10;
    private static String name;

    /*
    Output data
     */
    public static void outputModeSelectionMenu() {
        System.out.println("Please enter the game number end press Enter\n1 - Greet\n"
                + "2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
    }

    public static void outputYourChoice(final String choice) {
        System.out.println("Your choice - " + choice + "\n");
    }

    public static void outputTextQuestions(final String output) {
        System.out.println("Question: " + output);
    }

    public static void outputTextUserAnswer() {
        System.out.print("Your answer: ");
    }

    public static void outputGoodbyeMsg() {
        System.out.println("Goodbye my friend's!");
    }

    public static void outputTextGreeting() {
        System.out.println("Welcome To The Brain Games!");
    }

    public static void outputTextCongratulation(final String person) {
        System.out.println("Congratulations, " + person + "!");
    }

    public static void outputNamePerson() {
        System.out.print("May I have your name? ");
        name = Cli.getName();
        System.out.printf("Hello, %s!\n", name);
    }

    public static void outputGameCalcRules() {
        System.out.println("What is the result of the expression?\n");
    }

    public static void outputGameEvenRules() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'\n");
    }

    public static void outputGameGcdRules() {
        System.out.println("Find the greatest common divisor of given numbers.\n");
    }

    public static void outputGamePrimeRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n");
    }

    public static void outputGameProgressiveRules() {
        System.out.println("What number is missing in the progression?\n");
    }

    public static void outputIfAnswerCorrect() {
        System.out.println("Correct!");
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
        outputTextGreeting();
        outputNamePerson();
    }

    /*
    Input data
     */

    public static String inputStringAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static int inputIntAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    /*
    Engine Game Process
     */

    public static String getName() {
        return name;
    }

    public static boolean isCorrectInput(final String input) {
        return input.equals("yes") || input.equals("no");
    }

    public static int getIntAnswer(final String variable) {
        outputTextQuestions(variable);
        outputTextUserAnswer();
        return inputIntAnswer();
    }

    public static String getStringAnswer(final String variable) {
        outputTextQuestions(variable);
        outputTextUserAnswer();
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

    public static boolean isCheckInputAnswer(final boolean variable,
                                             final String answer) {
        return variable && answer.equals("yes") || !variable && answer.equals("no");
    }

    public static boolean isCheckStringAnswer(final boolean variable,
                                              final String answer,
                                              final String person) {
        if (isCheckInputAnswer(variable, answer)) {
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
                                               final int answer,
                                               final String person) {
        if (variable == answer) {
            return false;
        } else {
            Engine.outputTextIncorrectInput(String.valueOf(answer), String.valueOf(variable), person);
            return true;
        }
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(FACTOR + 1);
    }

    public static void loops(final boolean variable,
                             final String person) {
        for (int i = 0; i < LOOPS; i++) {
            int number = Engine.getRandomNumber();
            String answer = Engine.getStringAnswer(String.valueOf(number));
            if (Engine.isCheckInput(answer, person)
                    || Engine.isCheckStringAnswer(variable, answer, person)) {
                return;
            }
            Engine.outputIfAnswerCorrect();
        }
        Engine.outputTextCongratulation(person);
    }

    public static void loopsIntGame(final String str,
                                    final String person,
                                    final int variable) {
        for (int i = 0; i < LOOPS; i++) {
            int answer = getIntAnswer(str);
            if (isCheckIntegerAnswer(variable, answer, person)) {
                return;
            }
            Engine.outputIfAnswerCorrect();
        }
        Engine.outputTextCongratulation(person);
    }

    public static String getRandomOperation() {
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
