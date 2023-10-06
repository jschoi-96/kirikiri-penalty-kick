package penaltykick.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameResult {
    private final List<GoalResult> goalResults;
    private final String playerName;

    public GameResult(List<GoalResult> goalResults, String playerName) {
        this.goalResults = new ArrayList<>(goalResults);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<GoalResult> getGoalResults() {
        return Collections.unmodifiableList(goalResults);
    }
}
