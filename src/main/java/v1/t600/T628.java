package v1.t600;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int x = nums[0] * nums[1] * nums[len-1];
        int y = nums[len - 1] * nums[len - 2] * nums[len - 3];
        return Math.max(x, y);
    }
}
