package v1.t400;

public class T494 {

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (target > sum || target < -sum) {
            return 0;
        }
        return findTargetSumWays(nums, 0, target, sum);
    }

    public int findTargetSumWays(int[] nums, int p, int target,int sum) {
        if (p >= nums.length) {
            return target == 0 ? 1 : 0;
        }
        if (target > sum || target < -sum) {
            return 0;
        }
        int res = 0;

        int num = nums[p];
        sum -= num;
        res += findTargetSumWays(nums, p + 1, target - num, sum );
        res += findTargetSumWays(nums, p + 1, target + num, sum);

        return res;
    }
}
