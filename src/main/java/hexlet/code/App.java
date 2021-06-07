package hexlet.code;

import hexlet.code.game.CalcGame;
import hexlet.code.game.EvenGame;
import hexlet.code.game.GcdGame;
import hexlet.code.game.PrimeGame;
import hexlet.code.game.ProgressionGame;

public class App {

    public static void main(String[] args) {

        Engine.outputModeSelectionMenu();

        String choice = Engine.inputStringAnswer();

        Engine.outputYourChoice(choice);

        switch (choice) {
            case ("1") -> Engine.outputStartInfoGame();
            case ("2") -> EvenGame.startEvenGame();
            case ("3") -> CalcGame.startCalcGame();
            case ("4") -> GcdGame.startGcdGame();
            case ("5") -> ProgressionGame.startProgressiveGame();
            case ("6") -> PrimeGame.startPrimeGame();
            default -> Engine.outputGoodbyeMsg();
        }
    }
}

