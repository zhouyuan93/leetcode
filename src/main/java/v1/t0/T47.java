package v1.t0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        res.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            Set<List<Integer>> temp = new HashSet<>();
            for (List<Integer> t : res) {
                int len = t.size();
                for (int j = 0; j <= len; j++) {
                    ArrayList<Integer> n = new ArrayList<>();
                    n.addAll(t);
                    n.add(j, x);
                    temp.add(n);
                }
            }

            res = temp;

        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(res);

        return ans;

    }
}
