package v1.t600;

/**
 * @author yuan.zhou
 */
public class T643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int res = sum;
        for (int x = 0, y = k; y < nums.length ; y++, x++) {
            sum = sum + nums[y] - nums[x];
            res = Math.max(res, sum);
        }
        return res/ 1.0 / k;
    }
}
