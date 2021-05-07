package v1.t1600;

public class T1690 {
    public int stoneGameVII(int[] stones) {
        int[] dp = new int[stones.length];

        int sum = 0;
        for (int i = 0; i < stones.length - 1; i++) {
            int x = stones[i];
            int y = stones[i + 1];
            dp[i] = Math.max(x, y);

            sum += x;
            stones[i] = sum;
        }
        stones[stones.length - 1] += sum;

        for (int p = 2; p < stones.length; p++) {
            for (int i = 0; i < stones.length - p; i++) {
                int left = i;
                int right = i + p;

                int sl = stones[right - 1] - (i == 0 ? 0 : stones[left - 1]) - dp[i];
                int sr = stones[right] - stones[left] - dp[i + 1];

                dp[i] = Math.max(sl, sr);

            }
        }

        return dp[0];

    }
}
