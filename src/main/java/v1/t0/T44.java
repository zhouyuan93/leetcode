package v1.t0;

public class T44 {
    public boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length()][p.length()];
        boolean res = get(dp, s, p, s.length() - 1, p.length() - 1);
        return res;
    }

    private boolean get(Boolean[][] dp, String s, String p, int si, int pi) {
        if (si < 0 && pi < 0) {
            return true;
        }
        if (pi < 0) {
            return false;
        }
        if (si < 0) {
            return p.charAt(pi) == '*' ? get(dp, s, p, si, pi - 1) : false;
        }
        if (dp[si][pi] != null) {
            return dp[si][pi];
        }
        boolean res = false;
        if (s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '?') {
            res = get(dp, s, p, si - 1, pi - 1);
        } else if (p.charAt(pi) == '*') {
            res = get(dp, s, p, si - 1, pi - 1)
                    || get(dp, s, p, si - 1, pi)
                    || get(dp, s, p, si, pi - 1);
        }

        dp[si][pi] = res;
        return res;
    }


}
