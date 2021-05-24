package v1.t1800;

public class T1871 {

    public boolean canReach(String s, int minJump, int maxJump) {
        if (s.charAt(s.length() - 1) == '1') {
            return false;
        }

        int[] dp;
        dp = new int[s.length()];

        dp[0] = 1;

        int sum = 1;
        for (int i = 1; i < s.length() - 1; i++) {
            int max = i - minJump;
            if (s.charAt(i) == '1' || max < 0) {
                dp[i] = sum;
                continue;
            }

            int min = i - maxJump - 1;
            if (min < 0 || dp[max] - dp[min] > 0) {
                sum++;
            }

            dp[i] = sum;

        }


        int len = s.length() - 1;
        int max = len - minJump;
        int min = len - maxJump - 1;
        return min < 0 || dp[max] - dp[min] > 0;

    }

}
