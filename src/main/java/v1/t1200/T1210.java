package v1.t1200;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class T1210 {
    public int minimumMoves(int[][] grid) {
        if (grid.length == 2 && grid[0].length == 1) {
            return 0;
        }

        if (grid.length == 1 && grid[0].length == 2) {
            return 0;
        }

        int xMax = grid.length;
        int yMax = grid[0].length;

        int[] s = {0, 0, 0, 1};

        // 0-横向 1-竖向
        int[][][] memo = new int[2][grid.length][grid[0].length];

        int step = 1;

        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(s);

        int size = queue.size();

        while (!queue.isEmpty()) {

            s = queue.poll();

            if (s[0] == s[2]) {
                // 横向

                // 向前移动
                if (s[3] + 1 < yMax && grid[s[2]][s[3] + 1] == 0) {
                    if (memo[0][s[2]][s[3] + 1] == 0) {
                        queue.add(new int[]{s[0], s[1] + 1, s[2], s[3] + 1});
                        memo[0][s[2]][s[3] + 1] = step;
                    }
                }

                // 向下移动
                if (s[2] + 1 < xMax && grid[s[2] + 1][s[3]] == 0 && grid[s[0] + 1][s[1]] == 0) {
                    if (memo[0][s[2] + 1][s[3]] == 0) {
                        queue.add(new int[]{s[0]+1, s[1], s[2] + 1, s[3]});
                        memo[0][s[2] + 1][s[3]] = step;
                    }
                }

                // 90度向下
                if (s[0] + 1 < xMax && grid[s[0] + 1][s[1]] == 0 && grid[s[2] + 1][s[3]] == 0) {
                    if (memo[1][s[0] + 1][s[1]] == 0) {
                        queue.add(new int[]{s[0], s[1], s[0] + 1, s[1]});
                        memo[1][s[0] + 1][s[1]] = step;
                    }
                }

            } else if (s[1] == s[3]) {
                // 竖向

                // 向下移动
                if (s[2] + 1 < xMax && grid[s[2] + 1][s[3]] == 0) {
                    if (memo[1][s[2] + 1][s[3]] == 0) {
                        queue.add(new int[]{s[0] + 1, s[1], s[2] + 1, s[3]});
                        memo[1][s[2] + 1][s[3]] = step;
                    }
                }

                // 向右移动
                if (s[3] + 1 < yMax && grid[s[2]][s[3] + 1] == 0 && grid[s[0]][s[1] + 1] == 0) {
                    if (memo[1][s[2]][s[3] + 1] == 0) {
                        queue.add(new int[]{s[0], s[1]+1, s[2], s[3] + 1});
                        memo[1][s[2]][s[3] + 1] = step;
                    }
                }


                // 90度向右边
                if (s[1] + 1 < yMax && grid[s[0]][s[1] + 1] == 0 && grid[s[2]][s[3] + 1] == 0) {
                    if (memo[0][s[0]][s[1] + 1] == 0) {
                        queue.add(new int[]{s[0], s[1], s[0], s[3] + 1});
                        memo[0][s[0]][s[1] + 1] = step;
                    }
                }
            }

            size--;
            if (size == 0) {
                step++;
                size = queue.size();
            }
        }

        int res = -1;
        if (memo[0][grid.length - 1][grid[0].length - 1] > 0) {
            res = memo[0][grid.length - 1][grid[0].length - 1];
        }

        for (int i = 0; i < memo[0].length; i++) {
            System.out.println(
                    Arrays.toString(memo[0][i])
            );
        }
        System.out.println("--------------");
        for (int i = 0; i < memo[1].length; i++) {
            System.out.println(
                    Arrays.toString(memo[1][i])
            );
        }

        return res;
    }
}
