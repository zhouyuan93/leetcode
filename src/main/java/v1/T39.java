package v1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        dfs(candidates, candidates.length, target, 0, new ArrayDeque<Integer>(), result);

        return result;
    }

    public void dfs(int[] candidates, int len, int target, int left, Deque<Integer> path,
                    List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = left; i < len; i++) {

            if (target - candidates[i] < 0) {
                break;
            }

            path.addLast(candidates[i]);
            dfs(candidates, len, target - candidates[i], i, path, result);
            path.removeLast();
        }

    }


}
