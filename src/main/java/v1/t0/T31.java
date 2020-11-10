package v1.t0;

/**
 * @author yuan.zhou
 */
public class T31 {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }

        int p = nums.length - 2;
        for (; p >= 0; p--) {
            if (nums[p + 1] > nums[p]) {
                break;
            }
        }

        int left = 0;
        int right = nums.length - 1;
        if (p >= 0) {
            left = p + 1;

            while (right > left) {
                if (nums[right] > nums[p]) {
                    break;
                }
                right --;
            }

            nums[p] ^= nums[right];
            nums[right] ^= nums[p];
            nums[p] ^= nums[right];
        }

        right = nums.length - 1;
        while (left < right) {
            nums[left] ^= nums[right];
            nums[right] ^= nums[left];
            nums[left] ^= nums[right];
            left++;
            right--;
        }
    }
}
