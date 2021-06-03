package v1.t500;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class T532 {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (!set.contains(a)) {
                int b = a - k;
                int c = a + k;
                if (set.contains(b)) {
                    res.add(b);
                }
                if (set.contains(c)) {
                    res.add(a);
                }
                set.add(a);
            } else if (k == 0 && !res.contains(a)) {
                res.add(a);
            }
        }
        System.out.println(res.toString());

        return res.size();
    }

}
