package v1.t500;

import java.util.HashSet;

public class T523 {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>(2*k);

        int before = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;
            if (set.contains(sum)) {
                return true;
            }
            set.add(before);
            before = sum;
        }

        return false;
    }
}
