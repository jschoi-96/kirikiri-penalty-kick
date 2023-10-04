package penaltykick.view;


import penaltykick.domain.Player;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static penaltykick.Utill.Reference.*;

public class InputView {
    private static Scanner sc = new Scanner(System.in);

    public void readInputController(List<Player> list){

        for (int i = 1; i <= PLAYER_COUNT; i++) {
            System.out.printf(PLAYER_MESSAGE,i);
            list.add(readInput());
        }
    }
    public  Player readInput() {
        String inputLine = sc.nextLine();

        List<Integer> list;
        try {
            list = Arrays.stream(inputLine.split(CUT_CHARACTER))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
        checkRange(list);
        Player player = new Player(list);
        return player;
    }
    public void checkRange(List<Integer> list){
        for(int n : list)
            if(n > 3 || n < 1)
                throw new IllegalArgumentException(ERROR_MESSAGE);
    }
}
