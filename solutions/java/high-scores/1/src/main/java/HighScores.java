import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class HighScores {
    private List<Integer> scoresAsList;
    
    public HighScores(List<Integer> highScores) {
        this.scoresAsList = highScores;
    }

    List<Integer> scores() {
        List<Integer> getScore = new ArrayList<> (scoresAsList);
        return getScore;
    }

    Integer latest() {
        return scores().getLast();
    }

    Integer personalBest() {
        return personalTopThree().get(0);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortScores = scores();
        Collections.sort(sortScores);
      
        
        List<Integer> topThree = new ArrayList<> ();

        if (sortScores.size() >= 3) {
            for (int i = 1; i <= 3; i++) {
                topThree.add(sortScores.get(sortScores.size() - i));
            }
        }
        else if (sortScores.size() == 2) {
            for (int i = 1; i <= 2; i++) {
                topThree.add(sortScores.get(sortScores.size() - i));
            }
        }
        else {
            topThree.add(sortScores.get(sortScores.size() - 1));
        }

        return topThree;
    }
}