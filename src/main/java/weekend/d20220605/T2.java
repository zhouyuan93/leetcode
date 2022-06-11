package weekend.d20220605;

import java.util.Arrays;

public class T2 {
    public int partitionArray(int[] nums, int k) {

        Arrays.sort(nums);

        int res = 1;
        int max = nums[0] + k;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                res ++;
                max = nums[i] + k;
            }
        }

        return res;
    }
}
