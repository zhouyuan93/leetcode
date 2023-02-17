package v1.t0;

import java.util.regex.Matcher;

public class T10 {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null || "".equals(s) || "".equals(p)) {
            return false;
        }

        // 定义dp[s len][p len]
        Boolean[][] dp = new Boolean[s.length()][p.length()];

        boolean res = get(dp, s.toCharArray(), p.toCharArray(), s.length() - 1, p.length() - 1);

        return res;
    }

    public boolean get(Boolean[][] dp, char[] s, char[] p, int si, int pi) {
        if (si < 0 && pi < 0) {
            return true;
        }
        if (si < 0) {
            if (p[pi] == '*') {
                return get(dp, s, p, si, pi - 2);
            } else {
                return false;
            }
        }
        if (pi < 0) {
            return false;
        }

        if (dp[si][pi] != null) {
            return dp[si][pi];
        }

        boolean res = false;
        if (s[si] == p[pi]) {
            res = get(dp, s, p, si - 1, pi - 1);
        } else if (p[pi] == '*') {
            res = get(dp, s, p, si, pi - 2);
            if (pi - 1 >= 0 && (p[pi - 1] == s[si] || p[pi - 1] == '.')) {
                res = res || get(dp, s, p, si - 1, pi)
                        || get(dp, s, p, si - 1, pi - 2);
            }
        } else if (p[pi] == '.') {
            res = get(dp, s, p, si - 1, pi - 1);
        } else {
            res = false;
        }

        dp[si][pi] = res;

        return res;
    }


}
