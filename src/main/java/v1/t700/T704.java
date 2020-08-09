package v1.t700;

/**
 * @author yuan.zhou
 */
public class T704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int p = (left + right) / 2;

        int res = -1;

        while (left <= right) {
            if (nums[p] < target) {
                left = p + 1;
            } else if (nums[p] > target) {
                right = p - 1;
            } else {
                return p;
            }
            p = (left + right) / 2;
        }

        return res;

    }
}
