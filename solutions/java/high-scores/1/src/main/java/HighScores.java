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
        return highScores.get(highScores.size() - 1);
    }

    public Integer personalBest() {
        int personalBest = 0;

        for (int score : highScores)
            if (score > personalBest)
                personalBest = score;
        
        return personalBest;
    }

    public List<Integer> personalTopThree() {
        List<Integer> topScores = new ArrayList<>(highScores);
        topScores.sort(Collections.reverseOrder());
        
        if(topScores.size() < 3 ) {
            return topScores.subList(0, topScores.size());
        } else {
            return topScores.subList(0, 3);
        }
    }
}
