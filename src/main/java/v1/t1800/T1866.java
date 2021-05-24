package v1.t1800;

public class T1866 {
    public static int MOD = 1_000_000_007;
    public static Long[][] dp;

    public int rearrangeSticks(int n, int k) {
        dp = new Long[k + 1][n + 1];
        for (int i = 0; i < k + 1; i++) {
            dp[i][i] = 1L;
        }


        return (int) getDp(n, k);

    }

    public long getDp(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        }

        if (dp[k][n] != null) {
            return dp[k][n];
        }


        long res = getDp(n - 1, k) * (n - 1) % MOD;

        res += getDp(n - 1, k - 1) % MOD;
        res %= MOD;
        dp[k][n] = res;

        return res;
    }
}
