package v1.t0;

import java.util.Arrays;

public class T96 {
    public int numTrees(int n) {
        int[] memo = new int[1];
        memo[0] = 1;
        int sum = 1;

        for (int i = 2; i <= n; i++) {
            int[] temp = new int[i];
            int ts = 0;
            for (int j = 0; j < i; j++) {
                if (j > 1) {
                    sum -= memo[j - 2];
                }
                temp[j] = sum;
                ts += sum;
            }
            memo = temp;
            sum = ts;
        }

        return sum;

    }
}
