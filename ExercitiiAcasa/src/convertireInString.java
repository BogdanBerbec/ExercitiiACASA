import java.time.LocalDate;
import java.util.*;

public class convertireInString {
    public static void main(String[] args) {
        int[] scores = {100, 100, 50, 40, 40, 20, 10};
        int[] alice = {112, 203, 11, 47, 66, 3};

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

        for (int i=0; i<alice.length; i++) {
            if (scoresList.contains(alice[i])) {
                listTotal.add(alice[i]);
            } else {
                listTotal.add(scores[i]);
                listTotal.add(alice[i]);
            }
        }

        for (int i=0; i<scores.length; i++) {
            if (!listTotal.contains(scores[i])) {
                listTotal.add(scores[i]);
            }
        }

        Collections.sort(listTotal);
        System.out.println(listTotal);

        int position = 1;
        int[] positionArray = new int[100];
        positionArray[0]=1;
        for (int i=listTotal.size()-1; i>0; i--) {
            if (aliceList.contains(listTotal.get(i))) {
                System.out.println("Scorul lui Alice " + listTotal.get(i) + " este pe pozitia " + position);
            }
            if (listTotal.get(i) > listTotal.get(i-1)) {
                int p = position++;
                positionArray[i]=p;
            }
        }

        if (aliceList.contains(listTotal.get(0))) {
            System.out.println("Scorul lui Alice " + listTotal.get(0) + " este pe pozitia " + position);
        }
    }
}
