package v1.t100;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T164 {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int res = 0;

        int before = nums[0];

        for (int num : nums) {
            res = Math.max(res, num - before);
            before = num;
        }

        return res;
    }
}
