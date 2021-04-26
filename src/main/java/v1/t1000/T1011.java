package v1.t1000;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1011 {
    public int shipWithinDays(int[] weights, int D) {
        int right = 0;
        int left = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            int mid = (left + right) >> 1;
            if (check(weights, mid, D)) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return right;
    }

    boolean check(int[] ws, int mid, int d) {
        int n = ws.length;
        int idx = 1;
        for (int i = 1, sum = ws[0]; i < n; sum = 0, idx++) {
            while (i < n && sum + ws[i] <= mid) {
                sum += ws[i];
                i++;
            }
        }
        return idx - 1 <= d;
    }
}
