package v1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T218 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) {
            return false;
        }

        if (nums.length < k) {
            k = nums.length-1;
        }

        int i = 0;
        int j = 0;

        Set<Integer> memory = new HashSet<>();

        for (; j <= k; j++) {
            if (memory.contains(nums[j])) {
                return true;
            }
            memory.add(nums[j]);
        }

        while (j < nums.length) {
            memory.remove(nums[i++]);
            if (memory.contains(nums[j])) {
                return true;
            }
            memory.add(nums[j++]);
        }

        return false;

    }
}
