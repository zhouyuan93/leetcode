package v1.t200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        return combinationSum3(k, n, 9);
    }

    public List<List<Integer>> combinationSum3(int k, int n, int lessThan) {
        List<List<Integer>> res = new ArrayList<>();
        if (k == 1) {
            if (lessThan >= n) {
                List<Integer> list = new ArrayList<>();
                list.add(n);
                res.add(list);
            }
            return res;
        }

        for (int i = lessThan; i > 0; i--) {
            if (n - i <= 0) {
                continue;
            }
            List<List<Integer>> tempList = combinationSum3(k - 1, n - i, i - 1);
            for (List<Integer> list : tempList) {
                list.add(i);
                res.add(list);
            }
        }
        return res;
    }
}
