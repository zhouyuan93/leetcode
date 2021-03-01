package v1.t1000;

/**
 * @author yuan.zhou
 */
public class T1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] nums = new int[60];
        for (int i : time) {
            nums[i % 60]++;
        }
        int ans = 0 ;
        for (int i = 1; i < 30; i++) {
            ans += nums[i] * nums[60 - i];
        }
        ans += nums[30] * (nums[30] - 1) / 2;
        ans += nums[0] * (nums[0] - 1) / 2;
        return ans;
    }
}
