package v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums.length > 0) {
            List<Integer> list = new ArrayList<Integer>() {{
                add(nums[0]);
            }};
            res.add(list);
        }

        for (int i = 1; i < nums.length; i++) {
            int addElement = nums[i];
            List<List<Integer>> tempRes = new ArrayList<>();
            for (List<Integer> node : res) {
                int j = -1;
                while (node.size() > j++) {
                    List<Integer> s = new ArrayList<>();
                    s.addAll(node);
                    s.add(j, addElement);
                    tempRes.add(s);
                }
            }
            res = tempRes;
        }

        return res;
    }

}
