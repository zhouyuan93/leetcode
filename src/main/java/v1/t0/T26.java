package v1.t0;

import java.util.Arrays;

public class T26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6};

        T26 t = new T26();
        int len = t.removeDuplicates(nums);
        System.out.println(len);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,len)));
    }
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = 0;
        int val = nums[0];
        for (int i : nums) {
            if (i != val) {
                len++;
                nums[len] = i;
                val = i;
            }
        }
        return  len+1;
    }
}
