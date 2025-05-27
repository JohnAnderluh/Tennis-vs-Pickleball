import java.util.ArrayList;

public class Questions {

    public ArrayList<ArrayList> bigQuestionList = new ArrayList<ArrayList>();
    public ArrayList<String> tennisQuestionList = new ArrayList<String>();
    public ArrayList<String> pickleQuestionList = new ArrayList<String>();

    public Questions() {
        tennisQuestionList.add("Do you have good hand-eye coordination?"); // tennis
        tennisQuestionList.add("Would you practice?"); // tenniis
        tennisQuestionList.add("Have you played pickleball/tennis before?"); // tennis
        tennisQuestionList.add("Do you taunt your opponents?"); // tennis
        tennisQuestionList.add("Have you been in a fight?"); // tennis
        tennisQuestionList.add("Do you like running? "); // Tennis
        tennisQuestionList.add("Do you like warming up?"); // tennis
        tennisQuestionList.add("Have you played racket sports before?"); // tennis
        tennisQuestionList.add("Do repetitive sounds annoy you?"); // tennis
        tennisQuestionList.add("Would you like to play for more than 1.5 hours?"); // Tennis
        tennisQuestionList.add("Do you grunt when you hit the ball?"); // Tennis
        pickleQuestionList.add("Are you over the age of 40?"); // Pickle
        pickleQuestionList.add("Is remembering the score difficult for you?"); // Pickle
        pickleQuestionList.add("Do you spend lots of time in the kitchen?"); // Pickle
        pickleQuestionList.add("Do you have back/shoulder problems?"); // Pickle
        pickleQuestionList.add("Do you like pancakes more than waffles?"); // Pickle
        pickleQuestionList.add("Do you ever hope to live in Florida?"); // Pickle
        pickleQuestionList.add("Do you play golf?"); // Pickle
        pickleQuestionList.add("Do you wake up after 11?"); // pickleball
        pickleQuestionList.add("Is your net worth higher than $1 million?"); // pickle
        pickleQuestionList.add("Do you prefer to listen to music while you play?"); // pickle
        pickleQuestionList.add("Would you play in the rain?"); // pickleball
        pickleQuestionList.add("Are you scared of the ball?"); // pickle
        pickleQuestionList.add("Do you enjoy networking?"); // pickle
        pickleQuestionList.add("Do you play for fun over competition?"); // pickle
        bigQuestionList.add(tennisQuestionList);
        bigQuestionList.add(pickleQuestionList);
    }

    public String getNewRandomQuestion() { // Objet not string for now
        int randomArrayList = (int) (Math.random() * 2);
        if (tennisQuestionList.size() == 0) {
            randomArrayList = 1;
        } else if (pickleQuestionList.size() == 0) {
            randomArrayList = 0;
        }

        if (randomArrayList == 0) {
            int randomIndex = (int) (Math.random() * tennisQuestionList.size());
            String question = ((bigQuestionList.get(0).get(randomIndex))).toString();
            Game.questionType = 0;
            return tennisQuestionList.remove(randomIndex);
        }

        else {
            int randomIndex = (int) (Math.random() * pickleQuestionList.size());
            String question = ((bigQuestionList.get(1).get(randomIndex))).toString();
            Game.questionType = 1;
            return pickleQuestionList.remove(randomIndex);
        }

    }

}
