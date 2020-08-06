package v1.t900;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T931 {
    public int minFallingPathSum(int[][] A) {
        if (A.length == 1) {
            return A[0][0];
        }

        for (int i = A.length - 2; i >= 0; i--) {
            for (int j = A.length - 1; j >= 0; j--) {
                int x = A[i][j];

                int before = A[i + 1][j];

                if (j != 0) {
                    before = Math.min(before, A[i + 1][j - 1]);
                }

                if (j != A.length - 1) {
                    before = Math.min(before, A[i + 1][j + 1]);
                }

                A[i][j] += before;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i : A[0]) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }
}
