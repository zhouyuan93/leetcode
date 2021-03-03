package v1.t300;

/**
 * @author yuan.zhou
 */
public class T338 {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        if (num == 0) {
            return dp;
        }
        dp[1] = 1;
        if (num == 1) {
            return dp;
        }
        dp[2] = 1;
        int x = 3;
        while (x <= num) {
            dp[x] = dp[x >> 1] + x % 2;
            x++;
        }
        return dp;
    }
}
