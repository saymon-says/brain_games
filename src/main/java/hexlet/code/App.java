package hexlet.code;

import hexlet.code.game.CalcGame;
import hexlet.code.game.EvenGame;
import hexlet.code.game.GcdGame;
import hexlet.code.game.PrimeGame;
import hexlet.code.game.ProgressionGame;

import static hexlet.code.Engine.GOOD_BYE;

public class App {

    public static void main(String[] args) {

        outputModeSelectionMenu();

        String choice = Engine.inputStringAnswer();

        Engine.outputYourChoice(choice);

        switch (choice) {
            case ("1") -> Engine.outputStartInfoGame();
            case ("2") -> EvenGame.startEvenGame();
            case ("3") -> CalcGame.startCalcGame();
            case ("4") -> GcdGame.startGcdGame();
            case ("5") -> ProgressionGame.startProgressiveGame();
            case ("6") -> PrimeGame.startPrimeGame();
            default -> Engine.outputTextGameMessage(GOOD_BYE);
        }
    }

    private static void outputModeSelectionMenu() {
        System.out.println("Please enter the game number end press Enter\n1 - Greet\n"
                + "2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
    }
}

