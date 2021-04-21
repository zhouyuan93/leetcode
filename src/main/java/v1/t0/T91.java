package v1.t0;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T91 {
    public int numDecodings(String s) {
        Integer[] memo = new Integer[s.length()];
        int res =  numDecodings(s, 0, memo);
        System.out.println(Arrays.toString(memo));
        return res;
    }

    public int numDecodings(String s, int idx, Integer[] memo) {
        if (memo[idx] != null) {
            return memo[idx];
        }

        int res = 0;

        char c = s.charAt(idx);
        if (idx + 1 == s.length()) {
            if (c != '0') {
                res++;
            }
            memo[idx] = res;
            return res;
        }

        char c2 = s.charAt(idx + 1);
        int p = (c - '0') * 10 + (c2 - '0');
        if (idx + 2 == s.length()) {
            if (c != '0') {
                if (p > 0 && p <= 26) {
                    res++;
                }
                if (c2 != '0') {
                    res++;
                }
            }
            memo[idx] = res;
            return res;
        }

        if (c != '0') {
            res += numDecodings(s, idx + 1, memo);
            if ( p > 0 && p <= 26) {
                res += numDecodings(s, idx + 2, memo);
            }
        }


        memo[idx] = res;
        return res;

    }
}
