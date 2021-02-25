package v1.t600;

/**
 * @author yuan.zhou
 */
public class T600 {
    public int findIntegers(int num) {
        if (num == 0) {
            return 1;
        }

        String binaryString = Integer.toBinaryString(num);

        int len = binaryString.length();

        int[] dp = new int[Math.max(4, len)];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int res = dp[len - 1];

        int i = 1;
        for (; i < len; i++) {
            if (binaryString.charAt(i) == '1') {
                res += dp[len - i - 1];
                if (binaryString.charAt(i - 1) == '1') {
                    break;
                }
            }
        }

        if (i == len) {
            res++;
        }

        return res;

    }

}
