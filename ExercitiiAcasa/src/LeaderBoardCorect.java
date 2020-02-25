import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderBoardCorect {
    public static void main(String[] args) {

        int[] scores = {300, 297, 290, 286, 280, 275, 269, 263, 259, 254, 250, 244, 232, 229, 218, 207, 195, 184, 178, 165, 154, 142, 131, 127, 114, 103, 100, 100, 50, 40, 40, 20, 10};
        int[] alice = {5, 5, 7, 8, 25, 50, 73, 75, 77, 89, 95, 110, 113, 120, 123, 125, 127, 130, 133, 135, 137, 139, 141, 143, 147, 150, 290, 334, 450};

        ArrayList<Integer> scoresList = new ArrayList<>();
        for (int i = 0; i<scores.length; i++) {
            scoresList.add(scores[i]);
        }
        Collections.sort(scoresList);
        /*System.out.println(scoresList);*/

        /*int position = 1;*/
        int[] positionArray = new int[alice.length];
        int count = 0;
        for (int i = 0; i<alice.length; i++) {
            int position = 1;

            scoresList.add(alice[i]);

            Collections.sort(scoresList);
            System.out.println(scoresList);
            for (int j = scoresList.size()-1; j>0; j--) {
                if (alice[i] == scoresList.get(j)) {
                    count++;
                    break;
                }
                if (!scoresList.get(j).equals(scoresList.get(j - 1))) {
                    position++;
                }
            }
            positionArray[count] = position;
            System.out.println("Scorul lui Alice " + alice[i] + " este pe pozitia " + position);
        }
        System.out.println(Arrays.toString(positionArray));
    }
}
