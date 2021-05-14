package hexlet.code;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {

        System.out.println("Please enter the game number end press Enter\n1 - Greet\n"
                + "2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        try {
            Scanner scan = new Scanner(System.in);
            String choice = scan.next();

            System.out.println("Your choice - " + choice + "\n");

            switch (choice) {
                case ("1") -> {
                    Engine.greeting();
                    Engine.getName();
                }
                case ("2") -> {
                    Engine.greeting();
                    Engine.getName();
                    System.out.println("Answer 'yes' if number even otherwise answer 'no'\n");
                    Engine.startEvenGame();
                }
                case ("3") -> {
                    Engine.greeting();
                    Engine.getName();
                    System.out.println("What is the result of the expression?\n");
                    Engine.startCalcGame();
                }
                case ("4") -> {
                    Engine.greeting();
                    Engine.getName();
                    System.out.println("Find the greatest common divisor of given numbers.\n");
                    Engine.startGcdGame();
                }
                case ("5") -> {
                    Engine.greeting();
                    Engine.getName();
                    System.out.println("What number is missing in the progression?\n");
                    Engine.startProgressiveGame();
                }
                case ("6") -> {
                    Engine.greeting();
                    Engine.getName();
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n");
                    Engine.startPrimeGame();
                }
                default -> System.out.println("Goodbye my friend's!");
            }
        } catch (InputMismatchException e) {
            System.out.println(Engine.causeMessage());
        }
    }
}
