package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Scanner;

public class GcdGame {

    private static int firstNumber;
    private static int secondNumber;

    public static int getAnswerGcdGame() {
        firstNumber = Engine.getRandomNumber();
        secondNumber = Engine.getRandomNumber();
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        System.out.print("Your answer: ");

        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static boolean checkAnswerGcdGame(int answer, String person) {
        int resultGcd = findGcd(firstNumber, secondNumber);
        if (answer == resultGcd) {
            return true;
        } else {
            Engine.incorrectInput("" + answer, "" + resultGcd, person);
            return false;
        }
    }

    private static int findGcd(int a, int b) {
        BigInteger c = BigInteger.valueOf(a);
        BigInteger d = BigInteger.valueOf(b);
        return (c.gcd(d)).intValue();
    }
}
