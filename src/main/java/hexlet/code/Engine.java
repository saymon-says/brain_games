package hexlet.code;

import hexlet.code.game.PrimeGame;
import hexlet.code.game.GcdGame;
import hexlet.code.game.EvenGame;
import hexlet.code.game.CalcGame;
import hexlet.code.game.ProgressionGame;

public class Engine {

    private static final int LOOPS = 3;
    private static final int FACTOR = 10;
    private static String name;

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
        String answer = EvenGame.getAnswerEvenGame();
        EvenGame.checkAnswerEvenGame(answer, name);
    }

    public static void startCalcGame() {
        int answer = CalcGame.getAnswerCalcGame();
        CalcGame.checkAnswerCalcGame(answer, name);
    }

    public static void startGcdGame() {
        int answer = GcdGame.getAnswerGcdGame();
        GcdGame.checkAnswerGcdGame(answer, name);
    }

    public static void startProgressiveGame() {
        int answer = ProgressionGame.getAnswerProgressionGame();
        ProgressionGame.checkAnswerProgressionGame(answer, name);
    }

    public static void startPrimeGame() {
        String answer = PrimeGame.getAnswerPrimeGame();
        PrimeGame.checkAnswerPrimeGame(answer, name);
    }

    public static int getRandomNumber() {
        return (int) (1 + Math.random() * FACTOR);
    }

    public static boolean correctInput(String input) {
        return input.equals("yes") || input.equals("no");
    }

    public static void incorrectInput(String yourInput, String correctInput, String person) {
        System.out.println(yourInput + " is wrong answer ;(. Correct answer was " + correctInput + ".\n"
                + "Let's try again " + person + "!");
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
