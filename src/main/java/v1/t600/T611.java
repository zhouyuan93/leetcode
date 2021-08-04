package v1.t600;

import java.util.Arrays;

public class T611 {
    public int triangleNumber(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);

        int ans = 0;
        for (int i = 2; i < nums.length; i++) {
            for (int j = i - 1, k = 0; k < j; j--) {
                while (k < j && nums[k] + nums[j] <= nums[i]) {
                    k++;
                }
                ans += j - k;
            }
        }

        return ans;
    }
}
