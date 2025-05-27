import java.util.Scanner;

public class Game {
    public static int questionType = -1;

    public Game() {
        Questions question = new Questions();

        System.out.println("'y' for yes, 'n' for no");
        for (int i = 0; i < 25; i++) {
            System.out.println(question.getNewRandomQuestion());
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            if (questionType == 0) {
                if (answer.equals("y")) // SWITCH TO BUTTON
                {
                    Count.updateScore(1);
                } else {
                    Count.updateScore(-1);
                }
            } else {
                if (answer.equals("n")) {
                    Count.updateScore(1);
                } else {
                    Count.updateScore(-1);
                }
            }
        }

    }

    public static String over() {
        return Count.endPhrase();
    }

}
