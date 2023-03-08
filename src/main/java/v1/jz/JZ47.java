package v1.jz;

import java.util.Arrays;

public class JZ47 {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        dp[m - 1][n - 1] = grid[m - 1][n - 1];

        int res = getMaxValue(grid, dp, 0, 0);

        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));

        }
        return res;

    }

    private int getMaxValue(int[][] grid, int[][] dp, int y, int x) {
        if (dp.length <= y || dp[0].length <= x || y < 0 || x < 0) {
            return 0;
        }
        if (dp[y][x] > 0) {
            return dp[y][x];
        }

        int res = Math.max(getMaxValue(grid, dp, y + 1, x), getMaxValue(grid, dp, y, x + 1));

        res += grid[y][x];

        dp[y][x] = res;
        return res;
    }


}
