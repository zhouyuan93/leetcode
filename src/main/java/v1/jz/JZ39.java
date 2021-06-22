package v1.jz;


import java.util.Arrays;

public class JZ39 {
    public int majorityElement(int[] nums) {
        // int 32位
        int[] memo = new int[32];
        for (int num : nums) {
            if (num < 0) {
                memo[31]++;
            }

            for (int i = 0; i < 31; i++) {
                if ((num & (1 << i)) > 0) {
                    memo[i]++;
                }
            }
        }
        int res = 0;
        int helf = nums.length / 2;
        for (int i = 0; i < 31; i++) {
            if (memo[i] > helf) {
                res |= (1 << i);
            }
        }
        if (memo[31] > helf) {
            res = Integer.MIN_VALUE + res;
        }

        return res;

    }
}
