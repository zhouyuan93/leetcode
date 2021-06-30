package v1.t0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T77 {

    List<List<Integer>>[][][] dp;
    public List<List<Integer>> combine(int n, int k) {
        dp = new List[n][n][k];
        return combine(1, n, k);
    }

    public List<List<Integer>> combine(int begin, int end, int k) {
        if (dp[begin - 1][end - 1][k - 1] != null) {
            return dp[begin - 1][end - 1][k - 1];
        }

        List<List<Integer>> res = new ArrayList<>();

        if (end - begin + 1 < k) {
            dp[begin - 1][end - 1][k - 1] = res;
            return res;
        }

        if (k == 1) {
            for (int i = begin; i <= end; i++) {
                res.add(Collections.singletonList(i));
            }
            dp[begin - 1][end - 1][k - 1] = res;
            return res;
        }

        List<List<Integer>> temp = combine(begin + 1, end, k - 1);

        for (List<Integer> list : temp) {
            List<Integer> l = new ArrayList<>();
            l.add(begin);
            l.addAll(list);
            res.add(l);
        }

        res.addAll(combine(begin + 1, end, k));

        dp[begin - 1][end - 1][k - 1] = res;
        return res;
    }
}
