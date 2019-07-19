package history;

import java.util.Arrays;

public class T27 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3, 1, 23, 1, 2, 1};

        T27 t = new T27();
        int len = t.removeElement(nums, 1);
        System.out.println(len);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, len)));

    }
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = 0;
        for (int i: nums  ) {
            if (val != i) {
                nums[len++] = i;
            }
        }
        return len;
    }
}
