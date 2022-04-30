package v1.t900;

public class T908 {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];

        for (int x : nums) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        int res = max - min - 2 * k;

        return res < 0 ? 0 : res;

    }
}
