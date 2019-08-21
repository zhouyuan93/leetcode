package v1;

import java.util.Arrays;

public class T581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] old = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int begin = 0;
        int end = nums.length-1;
        while (begin< nums.length && nums[begin] == old[begin]) {
            begin++;
        }
        while (begin < end && nums[end] == old[end]) {
            end--;
        }
        return end-begin+1;
    }
}
