package v1.t1400;

/**
 * @author yuan.zhou
 */
public class T1464 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int x1;
        int x2;
        if (nums[0] > nums[1]) {
            x1 = nums[0];
            x2 = nums[1];
        } else {
            x1 = nums[1];
            x2 = nums[0];
        }

        for (int i = 2; i < nums.length; i++) {
            int y = nums[i];
            if (y > x1) {
                x2 = x1;
                x1 = y;
                continue;
            }

            if (y > x2) {
                x2 = y;
            }
        }

        return (x1 - 1) * (x2 - 1);

    }
}
