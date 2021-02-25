package v1.t500;

/**
 * @author yuan.zhou
 */
public class T583 {
    public int minDistance(String word1, String word2) {
        if (word1.length() == 0 || word2.length() == 0) {
            return 0;
        }

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        int[][] dp = new int[c1.length + 1][c2.length + 1];

        int c1Len = c1.length;
        int c2Len = c2.length;
        for (int i = 1; i <= c1Len; i++) {
            for (int j = 1; j <= c2Len; j++) {
                if (c1[i-1] == c2[j-1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return c1Len + c2Len - 2 * dp[c1Len][c2Len];

    }
}
