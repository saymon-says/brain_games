package hexlet.code;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        System.out.println("Please enter the game number end press Enter\n1 - Greet\n"
                + "2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Exit");

        Scanner scan = new Scanner(System.in);
        String choice = scan.next();

        System.out.println("Your choice - " + choice + "\n");

        switch (choice) {
            case ("1") -> Engine.greeting();
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
                System.out.println("What number is missing in the progression?");
                Engine.startProgressiveGame();
            }
            default -> System.out.println("Goodbye my friend's!");
        }
    }
}
