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

}
