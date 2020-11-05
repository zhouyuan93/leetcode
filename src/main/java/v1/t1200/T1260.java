package v1.t1200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        if (m == 0) {
            return new ArrayList<>();
        }

        int n = grid[0].length;
        //init res
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            res.add(new ArrayList<>());
        }

        if (n == 0) {
            return res;
        }

        k = m * n - (k % (m * n));
        int[] p = {(k / n) % m, k % n};

        //update res
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int y = p[0];
                int x = p[1];
                res.get(i).add(grid[y][x]);
                x++;
                if (x >= n) {
                    x = 0;
                    y++;
                }
                if (y >= m) {
                    y = 0;
                }
                p[0] = y;
                p[1] = x;
            }
        }

        return res;
    }
}
