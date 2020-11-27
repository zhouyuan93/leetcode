package v1.jz;

/**
 * @author yuan.zhou
 */
public class JZ21 {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int x = nums[left];
            if (x % 2 == 1) {
                left++;
            }else{
                nums[right] ^= nums[left];
                nums[left] ^= nums[right];
                nums[right] ^= nums[left];
                right--;
            }
        }

        return nums;

    }
}
