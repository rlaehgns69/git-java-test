package section08;

public class MidTerm {
    public int score(int[] scores) {
        int result = 0;
        for (int score : scores) {
            result += score;
        }
        return result;

    }
}
