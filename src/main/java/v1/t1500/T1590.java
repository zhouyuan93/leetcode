package v1.t1500;

import java.util.*;

public class T1590 {
    public int minSubarray(int[] nums, int p) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            count %= p;
            nums[i] = count;
        }

        if (count == 0) {
            return 0;
        }


        int res = nums.length;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] - count;
            if (x < 0) {
                x += p;
            }
            if (map.containsKey(x)) {
                res = Math.min(res, i - map.get(x));
            }
            map.put(nums[i], i);
        }

        if (res == nums.length) {
            return -1;
        }

        return res;
    }
}
