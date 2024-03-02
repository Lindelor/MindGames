package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameSet {

    public static String askName() {
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        var result = in.nextLine();
        System.out.println(String.format("Hello, %s!", result));
        return result;
    }

    public static String evenGame(String name) {
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var score = 0;

        while (score < 3) {
            var currentNumber = random.nextInt(200);
            System.out.println(String.format("Question: %d", currentNumber));
            Scanner in = new Scanner(System.in);
            var result = in.nextLine();

            if (result.equals("yes") && currentNumber % 2 == 0) {
                score += 1;
            } else if (result.equals("no") && currentNumber % 2 == 1) {
                score += 1;
            } else {
                GameController.wrongResult();
                score = 0;
            }
        }

        return GameController.win(name);
    }

    public static String calcGame(String name) {
        Random random = new Random();
        System.out.println("What is the result of the expression?");
        var score = 0;

        while (score < 3) {
            var a = random.nextInt(200);
            var b = random.nextInt(200);
            System.out.println(String.format("Question: %d + %d", a, b));
            Scanner in = new Scanner(System.in);
            try {
                var result = Integer.parseInt(in.nextLine());
                if (result == a + b) {
                    score += 1;
                } else {
                    GameController.wrongResult();
                    score = 0;
                }
            } catch (NumberFormatException e) {
                GameController.wrongResult();
                score = 0;
            }

        }
        return GameController.win(name);
    }

}