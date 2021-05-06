package v1.t1400;

public class T1460 {
    public String stoneGameIII(int[] stoneValue) {
        if (stoneValue == null || stoneValue.length == 0) {
            return "Tie";
        }

        int len = stoneValue.length;
        int[] dp = new int[len + 1];

        dp[len - 1] = stoneValue[len - 1];
        if (stoneValue.length > 1) {
            dp[len - 1] = stoneValue[len - 1];
            dp[len - 2] = Math.max(stoneValue[len - 2] - stoneValue[len - 1], stoneValue[len - 2] + stoneValue[len - 1]);

            for (int i = len - 3; i >= 0; i--) {
                int x1 = stoneValue[i];
                int x2 = x1 + stoneValue[i + 1];
                int x3 = x2 + stoneValue[i + 2];

                x1 = x1 - dp[i + 1];
                x2 = x2 - dp[i + 2];
                x3 = x3 - dp[i + 3];

                dp[i] = Math.max(x1, Math.max(x2, x3));
            }
        }


        if (dp[0] == 0) {
            return "Tie";
        } else if (dp[0] > 0) {
            return "Alice";
        } else {
            return "Bob";
        }
    }

}
