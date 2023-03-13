package v1.t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T78 {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        if (nums.length == 0) {
            return res;
        }

        ArrayList<Integer> e1 = new ArrayList<>();
        e1.add(nums[0]);
        res.add(e1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = res.size() - 1; j >= 0; j--) {
                List<Integer> t = new ArrayList<>(res.get(j));
                t.add(nums[i]);
                res.add(t);
            }
        }

        return res;
    }
}
