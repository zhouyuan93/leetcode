package v1.t200;

public class T213 {

    public int rob(int[] nums) {
        Integer[][] dp = new Integer[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i][i] = nums[i];
        }
        int x = nums[0] + notCircle(nums, dp, 2, nums.length - 2);
        int y = notCircle(nums, dp, 1, nums.length - 1);
        return Math.max(x, y);
    }

    public int notCircle(int[] nums, Integer[][] dp, int left, int right) {
        if (left > right) {
            return 0;
        }
        if (dp[left][right] != null) {
            return dp[left][right];
        }
        if (right - left == 1) {
            dp[left][right] = Math.max(nums[left], nums[right]);
            return dp[left][right];
        }
        int x = nums[left] + notCircle(nums, dp, left + 2, right);
        int y = notCircle(nums, dp, left + 1, right);
        dp[left][right] = Math.max(x, y);
        return dp[left][right];
    }
}
