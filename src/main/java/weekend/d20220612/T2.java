package weekend.d20220612;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public int minPathCost(int[][] grid, int[][] moveCost) {

        List<Integer> res = new ArrayList<>();

        int[] add = new int[grid.length * grid[0].length];

        int[] end = grid[grid.length - 1];
        for (int i = 0; i < end.length; i++) {
            add[end[i]] = end[i];
        }

        for (int i = grid.length - 2;  i >= 0; i--) {

            int[] row = grid[i];

            int[] next = grid[i + 1];

            for (int j = 0; j < row.length; j++) {

                int[] cost = moveCost[row[j]];

                int min = Integer.MAX_VALUE;

                for (int t = 0; t < cost.length; t++) {
                    int x = cost[t] + add[next[t]];
                    min = Math.min(min, x);
                }

                add[row[j]] = min + row[j];
            }
        }

        int rr = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            rr = Math.min(rr, add[grid[0][i]]);
        }


        return rr;

    }

    public int getMin(int[] x) {
        int min = Integer.MAX_VALUE;
        for (int t : x) {
            min = Math.min(t, min);
        }
        return min;
    }
}
