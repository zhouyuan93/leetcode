package v1.t1300;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yuan.zhou
 */
public class T1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = map.keySet().stream().sorted().collect(Collectors.toList());
        int sum = 0;
        for (Integer key : list) {
            int temp = sum;
            sum += map.get(key);
            map.put(key, temp);
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(nums[i]);
        }

        return res;

    }
}
