package v1.t1800;

import java.util.Arrays;

public class T1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
            res = Math.max(res, nums[i] + nums[j]);
        }
        return res;
    }
}
