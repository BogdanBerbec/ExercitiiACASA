import java.util.Arrays;

public class SirulLuiFibonacci {
    public static void main(String[] args) {
        int[] v = new int[25];
        v[0]=1;
        v[1]=1;
        for (int i=0; i<23; i++) {
            int nrSir = v[i] + v[i+1];
            v[i+2] = nrSir;
        }
        System.out.println(Arrays.toString(v));
    }
}
