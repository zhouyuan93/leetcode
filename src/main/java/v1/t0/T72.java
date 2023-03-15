package v1.t0;

import java.util.Arrays;

public class T72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        Integer[][] dp = new Integer[m][n];

        int res = getDp(dp, word1, word2, m - 1, n - 1);


        return res;
    }

    private int getDp(Integer[][] dp, String word1, String word2, int i, int j) {
        if (i < 0 && j < 0) {
            return 0;
        }
        if (i < 0) {
            return j + 1;
        }
        if (j < 0) {
            return i + 1;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = getDp(dp, word1, word2, i - 1, j - 1);
        } else {
            //插入
            int insert = getDp(dp, word1, word2, i, j - 1);
            //删除
            int delete = getDp(dp, word1, word2, i - 1, j);
            //替换
            int replace = getDp(dp, word1, word2, i - 1, j - 1);
            dp[i][j] = Math.min(Math.min(insert, delete), replace) + 1;
        }

        return dp[i][j];
    }

}
