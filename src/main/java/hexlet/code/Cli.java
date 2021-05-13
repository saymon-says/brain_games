package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String getName() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
