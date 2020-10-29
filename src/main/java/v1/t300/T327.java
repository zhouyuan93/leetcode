package v1.t300;

import java.util.ArrayList;

/**
 * @author yuan.zhou
 */
public class T327 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int res = 0;

        double[] arr = new double[nums.length];
        int arrLen = 0;

        for (int i = nums.length-1; i >= 0 ; i--) {

            int x = nums[i];

            for (int j = 0; j < arrLen; j++) {
                double y = arr[j] + x;
                if (y <= upper && y >= lower) {
                    res++;
                }
                arr[j] = y;
            }

            if (x <= upper && x >= lower) {
                res++;
            }

            arr[arrLen++] = x;

        }

        return res;
    }
}
