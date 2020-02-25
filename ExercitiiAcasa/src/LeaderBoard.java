import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeaderBoard {
    public static void main(String[] args) {
        /*int[] scores = {100, 100, 50, 40, 40, 20, 10};
        int[] alice = {11, 47, 100, 203, 100, 100, 46, 47, 11*//*, 66, 3*//*};*/

        int[] scores = {100, 100, 50, 40, 40, 20, 10};
        int[] alice = {5, 25, 50, 120};

        ArrayList<Integer> listTotal = new ArrayList<>();

        List<Integer> aliceList = new ArrayList<>();
        for (int i=0; i<alice.length; i++) {
            aliceList.add(alice[i]);
        }
        Collections.sort(aliceList);


        List<Integer> scoresList = new ArrayList<>();
        for (int i=0; i<scores.length; i++) {
            scoresList.add(scores[i]);
        }

        for (int i = 0; i<alice.length; i++) {
            listTotal.add(alice[i]);
        }

        for (int i = 0; i<scores.length; i++) {
            if (!listTotal.contains(scores[i])) {
                listTotal.add(scores[i]);
            }
        }
/*
        for (int i=0; i<alice.length; i++) {
            listTotal.add(scores[i]);
            listTotal.add(alice[i]);
        }
        for (int i=alice.length; i<scores.length; i++) {
            listTotal.add(scores[i]);
        }

        for (int i=0; i<scores.length; i++) {
            if (!listTotal.contains(scores[i])) {
                listTotal.add(scores[i]);
            }
        }
*/



        Collections.sort(listTotal);
        System.out.println(listTotal);

        int position = 1;
        int[] positionArray = new int[alice.length];
        int count = 0;
        positionArray[0]=1;
        for (int i=listTotal.size()-1; i>0; i--) {
            if (aliceList.contains(listTotal.get(i))) {
                System.out.println("Scorul lui Alice " + listTotal.get(i) + " este pe pozitia " + position);
                positionArray[count]=position;
                ++count;
            }
            if (listTotal.get(i) > listTotal.get(i-1)) {
                ++position;
            }
        }

        if (aliceList.contains(listTotal.get(0))) {
            System.out.println("Scorul lui Alice " + listTotal.get(0) + " este pe pozitia " + position);
            positionArray[count]=position;
        }
        System.out.println(Arrays.toString(positionArray));
        /*return positionArray;*/
    }
}
