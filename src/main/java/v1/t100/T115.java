package v1.t100;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T115 {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length()+1][s.length()+1];

        Arrays.fill(dp[t.length()], 1);

        for (int si = dp.length - 2; si >= 0; si--) {
            int count = 0;
            for (int ti = dp[si].length - 2; ti >= 0; ti--) {
                if (t.charAt(si) == s.charAt(ti)) {
                    count += dp[si + 1][ti+1];
                }
                dp[si][ti] = count;
            }
        }

        return dp[0][0];
    }

}
