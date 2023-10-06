package penaltykick.view;

import java.util.Map;
import penaltykick.domain.GameResult;
import penaltykick.domain.GoalResult;

public class OutputView {
    private static final String GOAL_SIGN = "O";
    private static final String NO_GOAL_SIGN = "X";
    private static final Map<GoalResult, String> RESULT_SIGN_MAP = Map.of(
            GoalResult.GOAL, GOAL_SIGN,
            GoalResult.NO_GOAL, NO_GOAL_SIGN
    );

    private OutputView() {}

    public static void printGameResults(GameResult gameResults) {
        System.out.printf("%s : ", gameResults.getPlayerName());

        gameResults.getGoalResults().stream()
                .map(RESULT_SIGN_MAP::get)
                .forEach(System.out::print);

        System.out.println();
    }

    public static void printWinner(String name) {
        System.out.printf("%s이(가) 우승했습니다\uD83C\uDF89\n", name);
    }

    public static void printDraw() {
        System.out.println("무승부입니다.");
    }
}
