package v1.t1100;

import sun.nio.cs.ext.MacHebrew;

import java.util.Arrays;

public class T1105 {
    public int minHeightShelves(int[][] books, int shelf_width) {
        int[] dp = new int[books.length];
        dp[0] = books[0][1];

        for (int i = 1; i < books.length; i++) {
            int idx;
            int tempWidth = shelf_width - books[i][0];
            int tempHeight = books[i][1];
            dp[i] = dp[i - 1] + books[i][1];
            for (idx = i-1; idx >= 0; idx--) {
                if (tempWidth < books[idx][0]) {
                    break;
                }
                tempHeight = Math.max(tempHeight, books[idx][1]);
                tempWidth -= books[idx][0];
                int temp = idx <= 0 ? tempHeight : dp[idx-1] + tempHeight;
                dp[i] = Math.min(temp, dp[i]);
            }
        }
        return dp[dp.length - 1];
    }
}
