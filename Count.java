public class Count {
    private int count;
    private int score;

    public count(){
        count = 0;
    }

    public void updateScore(int i) {
        // questions answered
        count += 1;
        // pickleball vs tennis counter
        score += i;
        if (count == 25) {
            Game.over();
        }
    }

    public String endPhrase() {
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
