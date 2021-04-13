package v1.t1600;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T1658 {
    public int minOperations(int[] nums, int x) {
        if (x == 0) {
            return 0;
        }

        int count = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count == x) {
                res = Math.min(i + 1, Integer.MAX_VALUE);
            }
            nums[i] = count;
        }

        int len = nums.length ;

        if (count < x) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = len - 1; i > 0; i--) {
            int need = x - nums[i-1];
            if (map.containsKey(need)) {
                res = Math.min(map.get(need) + i,res);
            }
            int right = nums[nums.length - 1] - nums[i - 1];
            if (right == x) {
                res = Math.min(len - i, res);
            }
            map.put(right, len - i);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public int getSum(int[] nums, int left, int right) {
        int res = 0;
        if (left > 0) {
            res += nums[left - 1];
        }
        if (right > 0) {
            res += nums[nums.length - 1] ;
            if (right < nums.length) {
                res -= nums[nums.length - 1 - right];
            }
        }

        return res;
    }

}
