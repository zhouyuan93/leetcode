package v1.t1000;

/**
 * @author yuan.zhou
 */
public class T1035 {
    public int maxUncrossedLines(int[] A, int[] B) {
        if (A.length > B.length) {
            return maxUncrossedLines(B, A);
        }
        Integer[][] dp = new Integer[A.length][B.length];
        return maxUncrossedLines(A, B, 0, 0, dp);
    }

    public int maxUncrossedLines(int[] A, int[] B, int al, int bl, Integer[][] dp) {
        if (al >= A.length || bl >= B.length) {
            return 0;
        }
        if (dp[al][bl] != null) {
            return dp[al][bl];
        }

        int res = 0;
        for (int i = al; i < A.length; i++) {
            int ax = A[i];
            for (int j = bl; j < B.length - res; j++) {
                int bx = B[j];
                if (ax == bx) {
                    int temp = 1 + maxUncrossedLines(A, B, i + 1, j + 1, dp);
                    res = Math.max(res, temp);
                }
            }
        }

        dp[al][bl] = res;
        return res;
    }

    public int maxUncrossedLines2(int[] nums1, int[] nums2) {
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
