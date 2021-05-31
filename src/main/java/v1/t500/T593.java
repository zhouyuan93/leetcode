package v1.t500;

import java.util.Arrays;

public class T593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        long[] nums = {getLength(p1, p2), getLength(p1, p3), getLength(p1, p4), getLength(p2, p3), getLength(p2, p4),
                getLength(p3, p4)};
        Arrays.sort(nums);

        long min = nums[0];
        long max = nums[5];

        if (min * 2 != max || min == max) {
            return false;
        }

        for (long num : nums) {
            if (num != min && num != max) {
                return false;
            }
        }

        return true;
    }

    public long getLength(int[] x, int[] y) {
        return (long) (Math.pow(x[0] - y[0], 2) + Math.pow(x[1] - y[1], 2));
    }


}
