package v1.jz;

public class JZ53 {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right - 1) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int x = left;

        left = 0;
        right = nums.length - 1;
        while (left < right - 1) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        int y = right;

        if (nums[x] == target) {
            x--;
        }

        if (nums[y] == target) {
            y++;
        }

        return Math.max(y - x - 1,0);

    }
}
