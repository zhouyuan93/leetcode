package v1.t2000;

import java.util.Arrays;
import java.util.Comparator;

public class T2008 {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, Comparator.comparingInt(a -> (a[0] << 10) + a[1]));

        long[] dp = new long[n+1];

        int p = -1;
        long pMax = 0;
        // 状态
        for (int[] ride : rides) {
            int start = ride[0];
            int end = ride[1];
            int tip = ride[2];
            if (p != start) {
                for (int i = p+1; i <= start; i++) {
                    if (dp[i] > pMax) {
                        pMax = dp[i];
                    }
                }
                p = start;
            }

            long x = pMax + end - start + tip;
            if (dp[end] < x) {
                dp[end] = x;
            }
        }

        long res = 0 ;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(dp[i], res);
        }

        return res;



    }
}
