package hexlet.code;

public class App {

    public static void main(String[] args) {

        Engine.outputModeSelectionMenu();

        String choice = Engine.inputStringAnswer();

        Engine.outputYourChoice(choice);

        switch (choice) {
            case ("1") -> Engine.outputStartInfoGame();
            case ("2") -> Engine.startEvenGame();
            case ("3") -> Engine.startCalcGame();
            case ("4") -> Engine.startGcdGame();
            case ("5") -> Engine.startProgressiveGame();
            case ("6") -> Engine.startPrimeGame();
            default -> Engine.outputGoodbyeMsg();
        }
    }
}

