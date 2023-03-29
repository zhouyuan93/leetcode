package v1.t1000;

import java.util.Arrays;

public class T1092 {
    public String shortestCommonSupersequence(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        int[][] s = new int[c1.length][c2.length];

        int l1 = c1.length - 1;
        int l2 = c2.length - 1;

        int max = dp(s, l1, l2, c1, c2) >> 2;

        char[] res = new char[max--];

        while (l1 >= 0 && l2 >= 0) {
            switch (s[l1][l2] & -s[l1][l2]) {
                case 2:
                    res[max--] = c2[l2];
                    l2--;
                    break;
                case 1:
                    res[max--] = c1[l1];
                    l1--;
                    break;
                default:
                    res[max--] = c1[l1];
                    l1--;
                    l2--;
            }
        }

        if (l1 >= 0) {
            System.arraycopy(c1, 0, res, 0, l1 + 1);
        }
        if (l2 >= 0) {
            System.arraycopy(c2, 0, res, 0, l2 + 1);
        }

        return new String(res);

    }

    private int dp(int[][] s, int l1, int l2, char[] c1, char[] c2) {
        if (l1 < 0 && l2 < 0) {
            return 0;
        } else if (l1 < 0) {
            return (l2 + 1) << 2;
        } else if (l2 < 0) {
            return (l1 + 1) << 2;
        }

        if (s[l1][l2] != 0) {
            return s[l1][l2];
        }

        int res;
        int p;

        if (c1[l1] == c2[l2]) {
            p = 0;
            res = dp(s, l1 - 1, l2 - 1, c1, c2);
        } else {
            int t1 = dp(s, l1 - 1, l2, c1, c2);
            int t2 = dp(s, l1, l2 - 1, c1, c2);
            if (t1 < t2) {
                p = 1;
                res = t1;
            } else {
                p = 2;
                res = t2;
            }
        }

        res = (((res >> 2) + 1) << 2) + p;

        s[l1][l2] = res;

        return res;
    }

}
