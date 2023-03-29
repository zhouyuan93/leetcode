package v1.t1000;

import java.util.Arrays;

public class T1092 {
    public String shortestCommonSupersequence(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        int[][] s = new int[c1.length][c2.length];
        int[][] step = new int[c1.length][c2.length];

        int l1 = c1.length - 1;
        int l2 = c2.length - 1;

        int max = dp(s, step, l1, l2, c1, c2);

        StringBuilder sb = new StringBuilder();
        while (l1 >= 0 && l2 >= 0) {
            switch (step[l1][l2]) {
                case 3:
                    sb.insert(0, c1[l1]);
                    l1--;
                    l2--;
                    break;
                case 2:
                    sb.insert(0, c2[l2]);
                    l2--;
                    break;
                case 1:
                    sb.insert(0, c1[l1]);
                    l1--;
            }
        }

        if (l1 >= 0) {
            sb.insert(0, c1, 0, l1 + 1);
        }
        if (l2 >= 0) {
            sb.insert(0, c2, 0, l2 + 1);
        }

        return sb.toString();

    }

    private int dp(int[][] s, int[][] step, int l1, int l2, char[] c1, char[] c2) {
        if (l1 < 0 && l2 < 0) {
            return 0;
        } else if (l1 < 0) {
            return l2 + 1;
        } else if (l2 < 0) {
            return l1 + 1;
        }

        if (s[l1][l2] != 0) {
            return s[l1][l2];
        }

        int res;
        int p;

        if (c1[l1] == c2[l2]) {
            p = 3;
            res = dp(s, step, l1 - 1, l2 - 1, c1, c2);
        } else {
            int t1 = dp(s, step, l1 - 1, l2, c1, c2);
            int t2 = dp(s, step, l1, l2 - 1, c1, c2);
            if (t1 < t2) {
                p = 1;
                res = t1;
            } else {
                p = 2;
                res = t2;
            }
        }

        res++;
        s[l1][l2] = res;
        step[l1][l2] = p;

        return res;
    }

}
