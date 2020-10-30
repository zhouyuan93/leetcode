package v1.t400;

/**
 * @author yuan.zhou
 */
public class T463 {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == grid.length - 1) {
                        res++;
                    }
                    if (i == 0) {
                        res++;
                    }
                    if (j == grid[0].length - 1) {
                        res++;
                    }
                    if (j == 0) {
                        res++;
                    }
                    continue;
                } else {
                    res += onePoint(i - 1, j, grid);
                    res += onePoint(i + 1, j, grid);
                    res += onePoint(i, j - 1, grid);
                    res += onePoint(i, j + 1, grid);
                }
            }
        }
        return res;
    }

    public int onePoint(int x, int y, int[][] grid) {
        if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length) {
            return grid[x][y];
        }
        return 0;
    }
}
