package v1.t1800;

import java.util.HashMap;
import java.util.Map;

public class T1814 {

    private static int MOD = (int) (1E9 + 7);

    public int countNicePairs(int[] nums) {
        long res = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] - rev(nums[i]);
            int count = map.getOrDefault(x, 0);
            res += count;
            res %= MOD;
            count++;
            map.put(x, count);
        }
        return (int) res;
    }

    public int rev(int x) {
        int y = 0;
        while(x > 0){
            int t = x % 10;
            x = x / 10;
            y = y * 10 + t;
        }
        return y;
    }
}
