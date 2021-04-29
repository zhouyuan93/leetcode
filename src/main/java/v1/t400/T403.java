package v1.t400;

public class T403 {
    Boolean[][] dp;

    public boolean canCross(int[] stones) {
        dp = new Boolean[stones.length][stones.length];
        return canCross(stones, 0, 0);
    }

    public boolean canCross(int[] stones, int p, int k) {
        if (p == stones.length - 1) {
            return true;
        }
        for (int i = p + 1; i < stones.length; i++) {
            int nextK = stones[i] - stones[p];
            if (nextK >= 0 && k - 1 <= nextK && nextK <= k + 1) {
                if (dp[p][i] != null) {
                    if (dp[p][i]) {
                        return true;
                    }
                } else {
                    boolean t = canCross(stones, i, nextK);
                    dp[p][i] = t;
                    if (t) {
                        return true;
                    }
                }
            }
            if (nextK >= k + 1) {
                break;
            }
        }
        return false;
    }

}
