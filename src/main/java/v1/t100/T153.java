package v1.t100;

public class T153 {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length-1;

        if (nums[left] < nums[right]) {
            return nums[left];
        }

        int mid = (left+right)/2;

        while (right - left > 1) {
            if (nums[mid] > nums[left]) {
                left = mid;
            }else{
                right = mid;
            }
            mid = (left+right)/2;
        }

        return Math.min(nums[left],nums[right]);
    }
}
