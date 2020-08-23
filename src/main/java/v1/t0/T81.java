package v1.t0;

/**
 * @author yuan.zhou
 */
public class T81 {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left+1 < right) {
            int p = (left + right) / 2;
            if (nums[p] > nums[left]) {
                left = p;
            }else if(nums[p] < nums[left]){
                right = p;
            }else{
                int t = left;
                while (nums[t] == nums[p] && t <= p) {
                    t++;
                }
                if (t - 1 == p) {
                    left = p;
                }else{
                    right = p;
                }
            }
        }

        return search(nums, 0, left, target) || search(nums, right, nums.length - 1, target);

    }

    public boolean search(int[] nums, int begin, int end, int target) {
        if (target < nums[begin] || target > nums[end]) {
            return false;
        }

        if (nums[begin] == target || nums[end] == target) {
            return true;
        }

        while (begin < end) {
            int p = (begin + end) / 2;
            if (nums[p] == target) {
                return true;
            } else if (nums[p] > target) {
                end = p - 1;
            } else if (nums[p] < target) {
                begin = p + 1;
            }
        }

        return false;
    }

}
