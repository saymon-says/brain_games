package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws InputMismatchException {

        System.out.println("Please enter the game number end press Enter\n1 - Greet\n"
                + "2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        try {
            Scanner scan = new Scanner(System.in);
            String choice = scan.next();

            System.out.println("Your choice - " + choice + "\n");

            switch (choice) {
                case ("1") -> {
                    Engine.outputGreetingAndGetName();
                }
                case ("2") -> {
                    Engine.startEvenGame();
                }
                case ("3") -> {
                    Engine.startCalcGame();
                }
                case ("4") -> {
                    Engine.startGcdGame();
                }
                case ("5") -> {
                    Engine.startProgressiveGame();
                }
                case ("6") -> {
                    Engine.startPrimeGame();
                }
                default -> System.out.println("Goodbye my friend's!");
            }
        } catch (InputMismatchException e) {
            System.out.println(Engine.causeMessage());
        }
    }
}
