package v1.t800;

/**
 * @author yuan.zhou
 */
public class T883 {
    public int projectionArea(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int x = 0;
        int[] y = new int[grid.length];
        int[] z = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int val = grid[i][j];
                if (val > 0) {
                    x += 1;
                }
                y[i] = Math.max(y[i], val);
                z[j] = Math.max(z[j], val);
            }
        }

        int res = x;
        for (int i : y) {
            res += i;
        }
        for (int i : z) {
            res += i;
        }

        return res;

    }
}
