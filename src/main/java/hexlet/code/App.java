package hexlet.code;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        String name;

        System.out.println("Please enter the game number end press Enter\n1 - Greet\n"
                + "2 - Even\n3 - Calc\n4 - Exit");

        Scanner scan = new Scanner(System.in);
        String choice = scan.next();

        System.out.println("Your choice - " + choice + "\n");

        switch (choice) {
            case ("1") -> System.out.println("Welcome To The Brain Games!");
            case ("2") -> {
                System.out.println("Welcome To The Brain Games!");
                System.out.print("May I have your name? ");
                name = Cli.getName();
                System.out.println("Hello! " + name + "\n");
                System.out.println("Answer 'yes' if number even otherwise answer 'no'\n");
                Game.getEvenNumber(name);
            }
            case ("3") -> {
                System.out.println("Welcome To The Brain Games!");
                System.out.print("May I have your name? ");
                name = Cli.getName();
                System.out.println("Hello! " + name + "\n");
                System.out.println("What is the result of the expression?\n");
                Game.getCalcAnswer(name);
            }
            default -> System.out.println("Goodbye my friend's!");
        }
    }
}
