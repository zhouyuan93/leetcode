package v1.t900;

import java.util.Arrays;

public class T905 {
    public int[] sortArrayByParity(int[] nums) {
        int q = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while ((nums[i] & 1) != 0 && i < q-1) {
                q--;
                nums[q] ^= nums[i];
                nums[i] ^= nums[q];
                nums[q] ^= nums[i];
            }
        }
        return nums;
    }
}
