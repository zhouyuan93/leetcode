package v1.t1000;

import java.util.Arrays;

public class T1033 {
    public int[] numMovesStones(int a, int b, int c) {
        int[] t = {a, b, c};
        Arrays.sort(t);

        int x = t[1] -t[0] - 1;
        int y = t[2] - t[1] - 1;
        if (x > y) {
            x ^= y;
            y ^= x;
            x ^= y;
        }

        int max = y+x;
        int min = 2;
        if(x == 0){
            if(y == 0){
                min = 0;
            }else{
                min = 1;
            }
        }else if(x == 1){
            min = 1;
        }
        return new int[]{min, max};
    }
}
