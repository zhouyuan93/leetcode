package v1.mst;

/**
 * @author yuan.zhou
 */
public class MST17_08 {
    public int bestSeqAtIndex(int[] height, int[] weight) {
        //快排序
        quickSort(height, weight, 0, height.length - 1);

        //寻找weight最长上升子序列长度
        int longest = 0;
        int[] dp = new int[weight.length + 1];
        dp[0] = Integer.MIN_VALUE;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < weight.length; i++) {
            int index = findGreaterOrEqual(dp, weight[i]);
            dp[index] = weight[i];
            longest = Math.max(longest, index);
        }
        return longest;
    }

    public int findGreaterOrEqual(int[] dp, int target) {
        int left = 0;
        int right = dp.length - 1;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (dp[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (dp[left] >= target) {
            return left;
        }
        return right;
    }

    public void quickSort(int[] h, int[] w, int left, int right) {
        if (left < 0 || right >= h.length || left >= right) {
            return;
        }
        int hn = h[left];
        int wn = w[left];
        int pl = left + 1;
        int pr = right;
        while (pl < pr) {
            if (h[pl] < hn || (h[pl] == hn && w[pl] > wn)) {
                h[pl - 1] = h[pl];
                w[pl - 1] = w[pl];
                pl++;
            } else {
                int temp = h[pr];
                h[pr] = h[pl];
                h[pl] = temp;

                temp = w[pr];
                w[pr] = w[pl];
                w[pl] = temp;

                pr--;
            }
        }
        if (h[pl] < hn || (h[pl] == hn && w[pl] > wn)) {
            h[pl - 1] = h[pl];
            w[pl - 1] = w[pl];
        } else {
            pl -= 1;
        }
        h[pl] = hn;
        w[pl] = wn;
        quickSort(h, w, left, pl - 1);
        quickSort(h, w, pl + 1, right);
    }
}
