package v1.t1700;

import java.util.Arrays;

public class T1706 {
    public int[] findBall(int[][] grid) {

        int len = grid[0].length;
        int[] res = new int[len];


        for (int i = 0; i < len; i++) {
            int p = i;
            int row = 0;
            while (row < grid.length) {
                if (grid[row][p] == 1) {
                    if (p + 1 < len && grid[row][p] == grid[row][p + 1]) {
                        p++;
                    }else{
                        p = -1;
                        break;
                    }
                }else{
                    if (p > 0 && grid[row][p] == grid[row][p - 1]) {
                        p--;
                    }else{
                        p = -1;
                        break;
                    }
                }
                row++;
            }
            res[i] = p;
        }

        return res;
    }

}
