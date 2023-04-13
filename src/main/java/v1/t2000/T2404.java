package v1.t2000;

import java.util.Arrays;

public class T2404 {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);

        int res = 0;
        int r = -1;

        int before = nums[0];
        int c = 0;
        for (int x : nums) {
            if ((x & 1) == 1) {
                continue;
            }
            if (before == x) {
                c++;
            } else {
                if (c > res) {
                    res = c;
                    r = before;
                }
                c = 1;
                before = x;
            }
        }
        if (c > res) {
            r = before;
        }
        return r;
    }

}
