package v1.t700;

/**
 * @author yuan.zhou
 */
public class T742 {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        if (sum == nums[0]) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == sum - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
