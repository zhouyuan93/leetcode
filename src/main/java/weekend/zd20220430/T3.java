package weekend.zd20220430;

import java.util.Arrays;

public class T3 {

    public static final int WALL = -1;

    private int[][] UP;
    private int[][] DOWN;
    private int[][] LEFT;
    private int[][] RIGHT;
    private int m;
    private int n;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        this.m = m;
        this.n = n;
        UP = new int[m][n];
        DOWN = new int[m][n];
        LEFT = new int[m][n];
        RIGHT = new int[m][n];

        for (int[] w : walls) {
            UP[w[0]][w[1]] = WALL;
            DOWN[w[0]][w[1]] = WALL;
            LEFT[w[0]][w[1]] = WALL;
            RIGHT[w[0]][w[1]] = WALL;
        }


        for (int[] g : guards) {
            UP[g[0]][g[1]] = WALL;
            DOWN[g[0]][g[1]] = WALL;
            LEFT[g[0]][g[1]] = WALL;
            RIGHT[g[0]][g[1]] = WALL;

            int y = g[0];
            int x = g[1];

            if (x - 1 >= 0 && LEFT[y][x-1] == 0) {
                LEFT[y][x-1] = 1;
            }
            if (x + 1 < n && RIGHT[y][x+1] ==0) {
                RIGHT[y][x+1] = 1;
            }
            if (y - 1 >= 0 && DOWN[y-1][x]==0) {
                DOWN[y-1][x] = 1;
            }
            if (y + 1 < m && UP[y+1][x]==0) {
                UP[y+1][x] = 1;
            }
        }

        int count = 0;
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (getDown(y, x) > 0 || getLeft(y, x) > 0 || getUp(y, x) > 0 || getRight(y, x) > 0) {
                    count++;
                }
            }
        }

        return m*n - count-guards.length-walls.length;

    }

    public int getLeft(int y, int x) {
        if (x < 0 || x >= n) {
            return WALL;
        }
        if (LEFT[y][x] == 0) {
            LEFT[y][x] = getLeft(y,x+1);

        }
        return LEFT[y][x];
    }
    public int getRight(int y, int x) {
        if (x < 0 || x >= n) {
            return WALL;
        }
        if (RIGHT[y][x] == 0) {
            RIGHT[y][x] = getRight(y, x - 1);
        }
        return RIGHT[y][x];
    }
    public int getUp(int y , int x) {
        if (y >= m || y < 0) {
            return WALL;
        }
        if (UP[y][x] == 0) {
            UP[y][x] = getUp(y-1, x);
        }
        return UP[y][x];
    }

    public int getDown(int y, int x) {
        if (y >= m || y < 0) {
            return WALL;
        }
        if (DOWN[y][x] == 0) {
            DOWN[y][x] = getDown(y+1, x);
        }
        return DOWN[y][x];
    }


}
