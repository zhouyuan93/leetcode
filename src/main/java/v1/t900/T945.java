package v1.t900;

import java.util.Arrays;

public class T945 {
    public int minIncrementForUnique(int[] A) {
        if (A == null || A.length == 1) {
            return 0;
        }

        Arrays.sort(A);

        int res = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i-1]) {
                res += A[i-1] - A[i] + 1;
                A[i] = A[i-1] + 1;
            }
        }

        return res;
    }
}
