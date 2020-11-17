package v1.t500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T525 {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int res = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum--;
            }else{
                sum++;
            }

            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                res = Math.max(len, res);
            }else{
                map.put(sum, i);
            }

        }

        return res;
    }
}
