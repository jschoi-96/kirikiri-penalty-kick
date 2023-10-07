package penaltykick;

import java.util.ArrayList;

public class Application {
    // [] 와 ,를 빼고 출력하게 하는 메소드
    private static void printArrayList(ArrayList<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // OXList를 만드는 메서드
    private static ArrayList<String> OXListGenerator(ArrayList<Integer> playerNumberList, ArrayList<Integer> computerNumberList) {
        ArrayList<String> OXList = new ArrayList<>(); // 게임마다 초기화
        for (int i = 0; i < 5; i++) {
            if (playerNumberList.get(i).equals(computerNumberList.get(i))) {
                OXList.add("O");
            } else {
                OXList.add("X");
            }
        }
        return OXList;
    }




    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GoalKeeper goalKeeper = new GoalKeeper();
        Player player = new Player();

        System.out.println("페널티 킥 게임을 시작합니다.");
        System.out.println("총 5번의 위치를 입력해주세요.");

        ArrayList<Integer> computerNumber = goalKeeper.computerRandomNumberGenerator(5);
        ArrayList<Integer> player1Number = player.playerNumberGenerator(5);
        ArrayList<Integer> player2Number = player.playerNumberGenerator(5);

        System.out.println("플레이어1: ");
        printArrayList(player1Number);
        System.out.println("플레이어2: ");
        printArrayList(player2Number);

        ArrayList<String> player1_OX_List = OXListGenerator(player1Number,computerNumber);
        ArrayList<String> player2_OX_List = OXListGenerator(player2Number,computerNumber);
    }
}
