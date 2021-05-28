package v1.t400;

import java.util.Arrays;

public class T477 {
    public int totalHammingDistance(int[] nums) {
        int[] ones = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int j = 0;
            while (x > 0) {
                if ((x & 1) == 1) {
                    ones[j]++;
                }
                j++;
                x >>= 1;
            }
        }

        int res = 0;
        int len = nums.length;
        for (int one : ones) {
            res += (len - one) * one;
        }
        return res;
    }

}
