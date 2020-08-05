package v1.t700;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T764 {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        if (mines.length == N * N) {
            return 0;
        }
        if (N == 2) {
            return 1;
        }

        int[][] grid = new int[N][N];

        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = -1;
        }

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid.length - 1; j++) {

                if (grid[i][j] == -1) {
                    continue;
                }

                int x = grid[i - 1][j];
                int height = x == -1 ? 0 : (x / 1000 + 1);

                int y = grid[i][j - 1];
                int left = y == -1 ? 0 : y % 1000 + 1;

                grid[i][j] = left + height * 1000;
            }
        }

        int res = 0;
        for (int i = grid.length - 2; i > 0; i--) {
            for (int j = grid.length - 2; j > 0; j--) {
                int p = grid[i][j];

                if (grid[i][j] == -1) {
                    continue;
                }

                int left = p % 1000;
                int height = p / 1000;

                int x = grid[i + 1][j];
                int low = x == -1 ? 0 : x / 1000 + 1;

                int y = grid[i][j + 1];
                int right = y == -1 ? 0 : y % 1000 + 1;

                res = Math.max(res, Math.min(Math.min(left, right), Math.min(low, height)));

                grid[i][j] = right + low * 1000;
            }
        }

        return res + 1;
    }
}
