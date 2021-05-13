package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number end press Enter\n1 - Greet\n2 - Even\n3 - Exit");

        Scanner scan = new Scanner(System.in);
        String choice = scan.next();

        System.out.println("Your choice - " + choice + "\n");

        if (choice.equals("2")) {
            System.out.println("Welcome To The Brain Games!");
            System.out.print("May I have your name? ");

            String name = Cli.getName();
            System.out.println("Hello! " + name + "\n");

            System.out.println("Answer 'yes' if number even otherwise answer 'no'\n");
            Game.getAnswer();
        } else {
            System.out.println("Goodbye!");
        }
    }
}
