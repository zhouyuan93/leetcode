package v1.t300;

/**
 * @author yuan.zhou
 */
public class T300 {
    public int lengthOfLIS(int[] nums) {
        int[] count = new int[nums.length];
        count[0] = 1;
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, count[j]);
                }
            }
            max += 1;
            count[i] = max;
            ans = Math.max(max, ans);
        }
        return ans;
    }
}
