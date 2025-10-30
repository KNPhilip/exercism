import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public final class HighScores {
    private List<Integer> highScores = new ArrayList<>();
    
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    public List<Integer> scores() {
        return highScores;
    }

    public Integer latest() {
        return highScores.getLast();
    }

    public Integer personalBest() {
        return Collections.max(highScores);
    }

    public List<Integer> personalTopThree() {
        List<Integer> topScores = new ArrayList<>(highScores);
        topScores.sort(Collections.reverseOrder());
        return topScores.subList(0, Math.min(3, topScores.size()));
    }
}
