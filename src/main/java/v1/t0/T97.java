package v1.t0;

import java.util.Arrays;

public class T97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len2 + len1 != s3.length()) {
            return false;
        }

        int[][] dp = new int[len1 + 1][len2 + 1];

        int res = get(s1, s2, s3, dp, len1 - 1, len2 - 1);

        return res > 0;
    }

    private int get(String s1, String s2, String s3, int[][] dp, int p1, int p2) {
        if (p1 < 0 && p2 < 0) {
            return 1;
        }
        if (dp[p1 + 1][p2 + 1] != 0) {
            return dp[p1 + 1][p2 + 1];
        }

        int p3 = p1+p2+1;


        int res = -1;

        char c = s3.charAt(p3);
        if (p1 >= 0 && s1.charAt(p1) == c) {
            res = get(s1, s2, s3, dp, p1 - 1, p2);
        }
        if (res <= 0 && p2 >= 0 && s2.charAt(p2) == c) {
            res = get(s1, s2, s3, dp, p1, p2 - 1);
        }

        dp[p1 + 1][p2 + 1] = res;
        return res;
    }

}
