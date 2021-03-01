package v1.t900;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int left, int right) {
        if (right <= left) {
            return;
        }
        int n = nums[left];
        int start = left;
        int end = right;
        while (start < end) {
            int x = nums[start + 1];
            if(x <= n){
                nums[start++] = x;
            }else{
                int t = nums[end];
                nums[end--] = x;
                nums[start+1] = t;
            }
        }
        nums[start] = n;
        quickSort(nums, left, start - 1);
        quickSort(nums, start+1, right);
    }
}
