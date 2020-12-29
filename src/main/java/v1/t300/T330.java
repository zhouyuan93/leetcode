package v1.t300;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T330 {
    public int minPatches(int[] nums, int n) {
        int res = 0;

        long x = 1;
        int i = 0;

        while (x <= n) {
            if (i < nums.length && nums[i] <= x) {
                x += nums[i];
                i++;
            }else{
                x <<= 1;
                res++;
            }
        }

        return res;

    }
}
