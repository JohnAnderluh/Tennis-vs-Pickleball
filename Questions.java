import java.util.ArrayList;

public class Questions {

    private ArrayList<String> Questions = new ArrayList<String>();

    public Questions() {
        Questions.add("Do you have good hand-eye coordination?");
        Questions.add("Are you over the age of 40?");
        Questions.add("Do you like running? ");
        Questions.add("Is remembering the score difficult for you?");
        Questions.add("Do you spend lots of time in the kitchen?");
        Questions.add("Do you have back/shoulder problems?");
        Questions.add("Do you grunt when you hit the ball?");
        Questions.add("Do you like pancakes more than waffles?");
        Questions.add("Would you like to play for more than 1.5 hours?");
        Questions.add("Do you ever hope to live in Florida?");
        Questions.add("Do you play golf?");
        Questions.add("Do you like warming up?");
        Questions.add("Have you played racket sports before?");
        Questions.add("Do you wake up after 11?");
        Questions.add("Do you taunt your opponents?");
        Questions.add("Have you been in a fight?");
        Questions.add("Is your net worth higher than $1 million?");
        Questions.add("Do you prefer to listen to music while you play?");
        Questions.add("Have you played pickleball/tennis before?");
        Questions.add("Would you play in the rain?");
        Questions.add("Would you practice?");
        Questions.add("Do repetitive sounds annoy you?");
        Questions.add("Are you scared of the ball?");
        Questions.add("Do you enjoy networking?");
        Questions.add("Do you play for fun over competition?");
    }

    public String getNewRandomQuestion() {
        int randomIndex = (int) (Math.random() * Questions.size());
        System.out.println(Questions.remove(randomIndex));
        return Questions.remove(randomIndex);
    }

}
