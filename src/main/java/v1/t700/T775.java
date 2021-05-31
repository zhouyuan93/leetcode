package v1.t700;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class T775 {
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }
}
