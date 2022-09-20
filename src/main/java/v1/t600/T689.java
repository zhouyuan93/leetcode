package v1.t600;

import java.util.Arrays;

public class T689 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k == 1) {
            return true;
        }

        Arrays.sort(nums);

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        }

        int[] arr = new int[k];
        int average = sum / k;

        arr[0] = nums[nums.length - 1];
        if (arr[0] > average) {
            return false;
        }

        return validate(nums, nums.length - 1, arr, average);
    }

    private boolean validate(int[] nums, int p, int[] arr, int average) {
        if (p <= 0) {
            return true;
        }
        p--;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + nums[p] <= average) {
                arr[i] += nums[p];
                if (validate(nums, p, arr, average)) {
                    return true;
                }
                arr[i] -= nums[p];
            }
        }

        return false;
    }
}
