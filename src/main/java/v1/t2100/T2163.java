package v1.t2100;

import java.util.Arrays;
import java.util.PriorityQueue;

public class T2163 {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;

        long lc = 0;
        long rc = 0;

        // 由大到小
        PriorityQueue<Integer> lq = new PriorityQueue<>((x, y) -> y - x);

        // 由小到大
        PriorityQueue<Integer> rq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            lq.offer(nums[i]);
            lc += nums[i];
        }

        for (int i = nums.length - 1, j = 0; j < n; i--, j++) {
            rq.offer(nums[i]);
            rc += nums[i];
        }

        long[] dpL = new long[n + 1];
        long[] dpR = new long[n + 1];
        dpL[0] = lc;
        dpR[0] = rc;

        // L 取最小
        for (int i = n, j = 1; j <= n; i++, j++) {
            int x = nums[i];
            if (lq.peek() > x) {
                lc -= lq.poll();
                lc += x;
                lq.offer(x);
            }
            dpL[j] = lc;
        }

        // R 尽量大
        for (int i = 2 * n - 1, j = 1; j <= n; i--, j++) {
            int x = nums[i];
            if (rq.peek() < x) {
                rc -= rq.poll();
                rc += x;
                rq.offer(x);
            }
            dpR[j] = rc;
        }

        long res = Long.MAX_VALUE;

        int len = n + 1;
        for (int i = 0, j = n; i < len; i++, j--) {
            long x = dpL[i] - dpR[j];
            res = Math.min(x, res);
        }

        return res;

    }
}
