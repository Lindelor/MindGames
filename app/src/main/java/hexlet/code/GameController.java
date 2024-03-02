package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class GameController {
    private String[] games;

    GameController(String[] games) {
        this.games = Arrays.copyOf(games, games.length);
    }

    public String[] getGames() {
        return this.games;
    }

    public void setGames(String[] games) {
        this.games = Arrays.copyOf(games, games.length);
    }

    public void addGames(String[] games) {
        if (games == null) {
            return;
        }
        for (var elem : games) {
            var isUniq = true;
            for (var game : this.games) {
                if (elem.equals(game)) {
                    isUniq = false;
                }
            }
            if (isUniq) {
                this.games = Arrays.copyOf(this.games, this.games.length + 1);
                this.games[this.games.length - 1] = elem;
            }
        }
    }

    public int gamePick() {
        System.out.println("Please enter the game number and press Enter.");
        for (var i = 0; i < getGames().length; i++) {
            System.out.println(String.format("%d - %s", i + 1, getGames()[i]));
        }
        System.out.println("0 - Exit");
        System.out.print("Your chose: ");
        Scanner in = new Scanner(System.in);
        var result = in.nextLine();
        return Integer.parseInt(result);
    }

    public String play(int currentGameNumber, String name) throws Exception {
        if (currentGameNumber > getGames().length || currentGameNumber < 0) {
            throw new Exception("Invalid game number");
        }
        if (currentGameNumber == 0) {
            return "bye!";
        }
        if (getGames()[currentGameNumber - 1].equals("Greet")) {
            System.out.println("Welcome to the Brain Games!");
            return GameSet.askName();
        } else if (getGames()[currentGameNumber - 1].equals("Even")) {
            return GameSet.evenGame(name);
        }
        return "bye!";
    }

}
