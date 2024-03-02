package hexlet.code;

public class App {
    public static void main(String[] args) {
        String[] games = {"Greet"};
        GameController gameController = new GameController(games);
        int currentGameNumber = gameController.gamePick();

        if (currentGameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            var username = Cli.askName();
        }

    }

}
