package hexlet.code;

public class GameOutput {

    public static void askQuestion(String question) {
        System.out.println(question);
    }
    public static void initMessage(String message) {
        System.out.println(message);
    }

    public static void wrongResult() {
        System.out.println("Wrong answer ;(\n" + "Let's try again");
    }

    public static String win(String name) {
        return String.format("Congratulations, %s!", name);
    }



}
