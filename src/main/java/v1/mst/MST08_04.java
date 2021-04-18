package v1.mst;

import java.util.ArrayList;
import java.util.List;

public class MST08_04 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            add(res, num);
        }
        return res;
    }

    public void add(List<List<Integer>> res, int num) {
        int len = res.size();
        for (int i = 0; i < len; i++) {
            List<Integer> list = new ArrayList<>();
            list.addAll(res.get(i));
            list.add(num);
            res.add(list);
        }
    }
}
