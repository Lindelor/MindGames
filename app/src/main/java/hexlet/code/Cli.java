package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String askName() {
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        var result = in.nextLine();
        System.out.print(String.format("Hello, %s!", result));
        return result;
    }

}
