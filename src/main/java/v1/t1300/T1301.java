package v1.t1300;

import java.util.Arrays;
import java.util.List;

public class T1301 {
    public static int MOD = 1_000_000_007;
    public int[] pathsWithMaxScore(List<String> board) {
        int col = board.get(0).length();
        int row = board.size();

        long[] dp = new long[col + 1];
        long[] counts = new long[col + 1];

        counts[0] = 1;

        for (int i = 0; i < board.size(); i++) {

            long[] dpTemp = new long[col + 1];
            long[] countsTemp = new long[col + 1];

            String s = board.get(i);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'X' ) {
                    continue;
                }

                if (c == 'E' || c == 'S') {
                    c = '0';
                }

                int n = j + 1;

                long max = Math.max(Math.max(dp[j], dpTemp[j]), dp[n]);

                long count = 0;
                if (dp[j] == max) {
                    count += counts[j];
                }
                if (dpTemp[j] == max) {
                    count += countsTemp[j];
                }
                if (dp[n] == max) {
                    count += counts[n];
                }

                max += c - '0';
                max %= MOD;
                count %= MOD;

                if (count > 0) {
                    dpTemp[n] = max;
                }

                countsTemp[n] = count;

            }
            dp = dpTemp;
            counts = countsTemp;
        }

        return new int[]{(int) dp[col], (int) counts[col]};
    }


}
