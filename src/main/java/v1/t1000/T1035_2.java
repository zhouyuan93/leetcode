package v1.t1000;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1035_2 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return maxUncrossedLines(nums2, nums1);
        }

        int[][] dp = new int[nums1.length + 1][nums2.length + 1];

        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                int x1 = nums1[i - 1];
                int x2 = nums2[j - 1];
                if (x1 == x2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                dp[i][j] = Math.max(dp[i][j], Math.max(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        return dp[nums1.length][nums2.length];

    }
}
