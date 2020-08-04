package v1.t100;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T128 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 1;
        int curr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }else if (nums[i] - nums[i-1] == 1) {
                curr++;
            }else{
                res = Math.max(curr, res);
                curr = 1;
            }
        }
        return Math.max(curr,res);
    }
}
