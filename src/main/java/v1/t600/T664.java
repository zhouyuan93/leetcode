package v1.t600;

public class T664 {

    public int strangePrinter(String s) {
        int n = s.length();

        int[][] dp = new int[n + 1][n + 1];

        for (int len = 1; len <= n; len++) {
            for (int l = 0, r = len - 1; r < n; l++, r++) {
                dp[l][r] = dp[l + 1][r] + 1;

                char c = s.charAt(l);
                for (int k = l + 1; k <= r; k++) {
                    if (c == s.charAt(k)) {
                        dp[l][r] = Math.min(dp[l][r], dp[l][k - 1] + dp[k + 1][r]);
                    }
                }
            }
        }

        return dp[0][n - 1];
    }
}
