package v1.t0;

/**
 * @author yuan.zhou
 */
public class T53 {
    public int maxSubArray2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[][] memory = new int[nums.length][nums.length];

        int res = nums[0];

        for (int i = 0; i < nums.length; i++) {
            memory[i][i] = nums[i];
            if (nums[i] > res) {
                res = nums[i];
            }
        }

        int step = 1;
        while (step < nums.length) {
            for (int j = step; j < nums.length; j++) {
                int i = j - step;
                int temp = memory[i][j - 1] + nums[j];
                memory[i][j] = temp;
                if (res < temp) {
                    res = temp;
                }
            }
            step++;
        }
        return res;
    }

    public int maxSubArray(int[] nums) {
        int tmp = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum = sum > 0 ? sum + num : num;
            if (tmp <= sum) {
                tmp = sum;
            }
        }
        return tmp;
    }

}
