package v1.t700;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T730 {

    private static final int MOD = 1000000007;
    int[][] dp;
    char[] c;

    public int countPalindromicSubsequences(String s) {
        this.c = s.toCharArray();

        int len = s.length();
        dp = new int[len][len];

        // init
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        int res = get(0, len - 1);

        return res;
    }

    public int get(int b, int e) {
        if (b > e) {
            return 0;
        }
        if (dp[b][e] > 0) {
            return dp[b][e];
        }

        long res = 0;

        char l = c[b];
        char r = c[e];

        if (l != r) {
            res += get(b, e - 1);
            res += get(b + 1, e);
            res += MOD;
            res -= get(b + 1, e - 1);
            dp[b][e] = (int) (res % MOD);
        } else {
            int a1 = -1;
            int a2 = -1;
            int a3 = -1;
            int a4 = -1;
            for (int i = b + 1, j = e - 1; i <= j; i++, j--) {
                if (c[i] == l) {
                    if (a1 == -1) {
                        a1 = i;
                    } else {
                        a2 = i;
                    }
                }
                if (j != i && c[j] == l) {
                    if (a4 == -1) {
                        a4 = a3;
                    }
                    a3 = j;
                }
            }

            List<Integer> list = new ArrayList<>();
            if (a1 != -1) {
                list.add(a1);
            }
            if (a2 != -1) {
                list.add(a2);
            }
            if (a3 != -1) {
                list.add(a3);
            }
            if (a4 != -1) {
                list.add(a4);
            }

            int left = -1;
            int right = -1;
            if (list.size() > 0) {
                left = list.get(0);
            }
            if (list.size() > 1) {
                right = list.get(list.size() - 1);
            }


            res = (get(b + 1, e - 1) * 2L) % MOD;
            if (left == -1) {
                res += 2;
                dp[b][e] = (int) (res % MOD);
                return dp[b][e];
            }

            if (right == -1) {
                res += 1;
                dp[b][e] = (int) (res % MOD);
                return dp[b][e];
            }

            res += (MOD - get(left + 1, right - 1));
            res %= MOD;
            dp[b][e] = (int) (res % MOD);
        }

        return dp[b][e];
    }

}
