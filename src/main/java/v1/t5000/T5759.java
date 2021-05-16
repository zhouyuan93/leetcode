package v1.t5000;

import java.util.ArrayList;
import java.util.List;

public class T5759 {
    List<Integer> res = new ArrayList<>();
    int sum = 0;

    public int subsetXORSum(int[] nums) {
        res.add(0);

        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }

        return sum;
    }

    public void add(int x) {
        int len = res.size();
        for (int i = 0; i < len; i++) {
            int t = res.get(i) ^ x;
            res.add(t);
            sum += t;
        }
    }
}
