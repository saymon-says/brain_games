package hexlet.code;

import hexlet.code.game.CalcGame;
import hexlet.code.game.EvenGame;
import hexlet.code.game.GcdGame;
import hexlet.code.game.PrimeGame;
import hexlet.code.game.ProgressionGame;

import java.util.Random;

public class Engine {

    private static final int LOOPS = 3;
    private static final int FACTOR = 10;
    private static String name;

    public static void outputGreetingAndGetName() {
        greeting();
        getName();
    }

    public static void greeting() {
        System.out.println("Welcome To The Brain Games!");
    }

    public static void congratulation(String person) {
        System.out.println("Congratulations, " + person + "!");
    }

    public static void getName() {
        System.out.print("May I have your name? ");
        name = Cli.getName();
        System.out.println("Hello, " + name + "!\n");
    }

    public static void startEvenGame() {
        outputGreetingAndGetName();
        EvenGame.gameRules();
        for (int i = 0; i < LOOPS; i++) {
            String answer = EvenGame.getAnswerEvenGame();
            if (!EvenGame.checkInputEvenGame(answer, name)
                    || !EvenGame.checkAnswerEvenGame(answer, name)) {
                return;
            }
            System.out.println("Correct!");
        }
        congratulation(name);
    }

    public static void startCalcGame() {
        outputGreetingAndGetName();
        CalcGame.gameRules();
        for (int i = 0; i < LOOPS; i++) {
            int answer = CalcGame.getAnswerCalcGame();
            if (!CalcGame.checkAnswerCalcGame(answer, name)) {
                return;
            }
            System.out.println("Correct!");
        }
        congratulation(name);
    }

    public static void startGcdGame() {
        outputGreetingAndGetName();
        GcdGame.gameRules();
        for (int i = 0; i < LOOPS; i++) {
            int answer = GcdGame.getAnswerGcdGame();
            if (!GcdGame.checkAnswerGcdGame(answer, name)) {
                return;
            }
            System.out.println("Correct!");
        }
        congratulation(name);
    }

    public static void startProgressiveGame() {
        outputGreetingAndGetName();
        ProgressionGame.gameRules();
        for (int i = 0; i < LOOPS; i++) {
            int answer = ProgressionGame.getAnswerProgressionGame();
            if (!ProgressionGame.checkAnswerProgressionGame(answer, name)) {
                return;
            }
            System.out.println("Correct!");
        }
        congratulation(name);
    }

    public static void startPrimeGame() {
        outputGreetingAndGetName();
        PrimeGame.gameRules();
        for (int i = 0; i < LOOPS; i++) {
            String answer = PrimeGame.getAnswerPrimeGame();
            if (!PrimeGame.checkAnswerPrimeGame(answer, name)
                    || !PrimeGame.checkInputPrimeGame(answer, name)) {
                return;
            }
            System.out.println("Correct!");
        }
        congratulation(name);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(FACTOR + 1);
    }

    public static boolean correctInput(String input) {
        return input.equals("yes") || input.equals("no");
    }

    public static void incorrectInput(String yourInput, String correctInput, String person) {
        String out = String.format("%s is wrong answer ;(. Correct answer was %s.\n"
                + "Let's try again, %s!", yourInput, correctInput, person);
        System.out.println(out);
    }

    public static String getRandomOperation() {
        int numberOperation = (int) (Math.random() * LOOPS);

        if (numberOperation == 0) {
            return " + ";
        } else if (numberOperation == 1) {
            return " - ";
        } else {
            return " * ";
        }
    }

    public static String causeMessage() {
        return "Your input fail!";
    }
}
