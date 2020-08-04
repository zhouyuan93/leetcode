package v1.t0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        dfs(candidates, candidates.length, 0, target, new ArrayDeque<>(), res);

        return res;
    }

    private void dfs(int[] candidates, int len, int left, int target, Deque<Integer> path, List<List<Integer>> res ) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = left; i < len;i++) {
            //剪枝
            if (target - candidates[i] < 0) {
                break;
            }

            path.addLast(candidates[i]);

            dfs(candidates, len, i + 1, target - candidates[i], path, res);
            path.removeLast();

            //二次剪枝
            while (i+1 < len && candidates[i] == candidates[i + 1]) {
                i++;
            }

        }

    }
}
