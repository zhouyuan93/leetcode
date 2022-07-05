package v1.t1400;

import java.util.HashMap;
import java.util.Map;

public class T1439 {
    int[][] mat;

    public int kthSmallest(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        this.mat = mat;

        int l = 0;
        int r = 0;

        for (int[] ints : mat) {
            l += ints[0];
            r += ints[n - 1];
        }

        int minSum = l;
        while (l < r) {
            int mid = (l + r) >> 1;
            int count = getCount(0, mid, k, minSum);
            if (count >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }


    // sum =
    public int getCount(int y, int mid, int k, int sum) {
        int m = mat.length;
        int n = mat[0].length;
        if (sum < 0) {
            return 0;
        }
        if (y >= mat.length) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int nextSum = sum - mat[y][0] + mat[y][i];
            if (nextSum <= mid) {
                res += getCount(y + 1, mid, k, nextSum);
                if (res >= k) {
                    return res;
                }
            } else {
                break;
            }
        }
        return res;
    }
}
