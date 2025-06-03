public class Count {
    public static int count;
    public static int score;

    public void count() {
        count = 0;
    }

    public static void updateScore(int i) {
        // questions answered
        count += 1;
        // pickleball vs tennis counter
        score += i;
    }

    public static String endPhrase() {
        // calculate % confidence
        int certainty = Math.abs(score) * 4;
        if (score == 0) {
            return "Indeterminate test.";
        } else if (score < 0) {
            return "We are " + certainty + "% sure you would prefer pickleball.";
        } else {
            return "We are " + certainty + "% sure you would prefer tennis.";
        }
    }
}
