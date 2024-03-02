package hexlet.code;

public class App {
    public static void main(String[] args) {
        String[] games = {"Greet", "Even"};
        GameController gameController = new GameController(games);
        String name = null;
        while (true) {
            try {
                int currentGameNumber = gameController.gamePick();
                if (currentGameNumber == 0) {
                    break;
                }
                if (name == null) {
                    var result = gameController.play(currentGameNumber, "Unknown person");
                    if (currentGameNumber == 1) {
                        name = result;
                    }
                } else {
                    var result = gameController.play(currentGameNumber, name);
                    System.out.println(result);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
