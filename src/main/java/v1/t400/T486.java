package v1.t400;

/**
 * @author yuan.zhou
 */
public class T486 {
    public boolean PredictTheWinner(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int l = run(nums,1,nums.length-1,-1) + nums[0];
        int r = run(nums, 0, nums.length - 2, -1) + nums[nums.length - 1];
        return  l >= 0 || r >= 0;
    }

    public int run(int[] nums, int left, int right, int isA) {
        if (left == right) {
            return nums[left] * isA;
        }
        int l = run(nums, left + 1, right, isA * -1) + nums[left] * isA;
        int r = run(nums, left, right - 1, isA * -1) + nums[right] * isA;
        return  isA > 0 ? Math.max(l,r) : Math.min(l,r);
    }
}
