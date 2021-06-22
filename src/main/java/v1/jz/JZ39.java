package v1.jz;


import java.util.Arrays;

public class JZ39 {
    public int majorityElement(int[] nums) {
        // int 32位
        int[] memo = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32 && num != 0;  i++) {
                if ((num & 1) > 0) {
                    memo[i]++;
                }
                num >>>= 1;

            }
        }
        int res = 0;
        int half = nums.length / 2;
        for (int i = 31 ; i >= 0; i--) {
            res <<= 1;
            if (memo[i] > half) {
               res |= 1;
            }
        }

        return res;

    }
}
