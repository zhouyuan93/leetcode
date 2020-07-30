package v1;

import java.util.Arrays;

public class T910 {
    public int smallestRangeII(int[] A, int K) {
        //A长度为1
        if (A == null || A.length == 1) {
            return 0;
        }
        Arrays.sort(A);
        int res = A[A.length - 1] - A[0];
        //A最大值和最小值大于4K
        if (res >= 4 * K) {
            return res - 2 * K;
        }

        int aMax = A[A.length - 1] - K;
        int aMin = A[0] + K;
        for (int i = 0; i < A.length - 1; i++) {
            int left = A[i];
            int right = A[i + 1];
            int high = Math.max(aMax, left + K);
            int low = Math.min(aMin, right - K);
            res = Math.min(res, high - low);
        }

        return res;
    }
}
