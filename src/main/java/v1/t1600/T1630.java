package v1.t1600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int len = nums.length;

        int[] sum = new int[len+1];

        sum[1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            if (r[i] - l[i] < 2) {
                res.add(true);
                continue;
            }
            int[] t = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(t);
            int dif = t[1] - t[0];
            boolean x = true;
            for (int j = 2; j < t.length; j++) {
                if (t[j] - t[j - 1] != dif) {
                    x = false;
                    break;
                }
            }
            res.add(x);
        }

        return res;
    }

}
