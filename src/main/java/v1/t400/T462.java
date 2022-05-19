package v1.t400;

import java.math.BigDecimal;
import java.util.Arrays;

public class T462 {
    public int minMoves2(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);

        int mid = nums[nums.length / 2];

        int res = 0;
        for (int n : nums) {
            res += Math.abs(n - mid);
        }
        return res;
    }
}
