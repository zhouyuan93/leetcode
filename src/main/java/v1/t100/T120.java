package v1.t100;

import java.util.List;

public class T120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.isEmpty()) {
            return 0;
        }

        int[] memo = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> l = triangle.get(i);

            for (int j = 0; j < l.size(); j++) {
                memo[j] = Math.min(memo[j], memo[j + 1]) + l.get(j);
            }

        }

        return memo[0];
    }
}
