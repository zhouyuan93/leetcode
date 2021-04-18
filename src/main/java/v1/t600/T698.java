package v1.t600;

import java.util.Arrays;

public class T698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        int len = nums.length-1;
        int average = sum / k;
        if (nums[nums.length - 1] > average) {
            return false;
        }
        while (len > 0 && nums[len] == average) {
            len--;
            k--;
        }
        int[] group = new int[k];
        return search(group, len, nums, average);
    }

    public boolean search(int[] group, int idx, int[] nums, int target) {
        if (idx < 0) {
            return true;
        }

        int num = nums[idx--];

        for (int i = 0; i < group.length; i++) {
            if (group[i] >= target || group[i] + num > target) {
                continue;
            }

            group[i] += num;
            if (search(group, idx, nums, target)) {
                return true;
            }
            group[i] -= num;

            if (group[i] == 0) {
                break;
            }
        }

        return false;
    }




}
