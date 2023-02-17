package v1.t1100;

public class T1139 {
    public int largest1BorderedSquare(int[][] grid) {
        int[][][] memo = new int[2][grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    count++;
                }
                memo[0][i][j] = count;
            }
        }

        for (int j = 0; j < grid[0].length; j++) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] > 0) {
                    count++;
                }
                memo[1][i][j] = count;
            }
        }

        int maxLen = 0;
        for (int i = 0; i < grid.length - maxLen; i++) {
            for (int j = 0; j < grid[i].length - maxLen; j++) {
                if (grid[i][j] > 0) {
                    int tempLen = Math.min(grid.length - i, grid[0].length - j);
                    while (tempLen > maxLen) {
                        if (validate(grid, memo, i, j, tempLen)) {
                            maxLen = tempLen;
                            break;
                        }else{
                            tempLen--;
                        }
                    }
                }
            }
        }

        return maxLen*maxLen;
    }

    private boolean validate(int[][] grid, int[][][] memo, int i, int j, int len) {
        int move = len - 1;
        if (i + move >= grid.length || j + move >= grid[0].length) {
            return false;
        }

        if (memo[0][i][j + move] != memo[0][i][j] + move) {
            return false;
        }

        if (memo[0][i + move][j + move] != memo[0][i + move][j] + move) {
            return false;
        }

        if (memo[1][i + move][j] != memo[1][i][j] + move) {
            return false;
        }

        if (memo[1][i + move][j + move] != memo[1][i][j + move] + move) {
            return false;
        }

        return true;
    }
}
