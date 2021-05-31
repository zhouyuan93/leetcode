package v1.t1600;

public class T1641 {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        for (int i = 1; i <= 5; i++) {
            dp[i-1] = i;
        }

        while (n-- > 1) {
            int sum = 0;
            for (int i = 0; i < dp.length; i++) {
                sum += dp[i];
                dp[i] = sum;
            }
        }

        return dp[4];
    }
}
