package weekend.d20210711;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class T2 {
    public int countPalindromicSubsequence(String s) {
        if (s == null || s.length() < 3) {
            return 0;
        }

        int res = 0;
        boolean[][] count = new boolean[26][26];

        int[] sum = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum[c - 'a']++;
        }

        int[] t = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            sum[idx]--;
            for (int j = 0; j < 26; j++) {
                if (count[idx][j] == false) {
                    if (sum[j] > 0 && t[j] > 0) {
                        res++;
                        count[idx][j] = true;
                    }
                }
            }
            t[idx]++;
        }

        return res;
    }
}
