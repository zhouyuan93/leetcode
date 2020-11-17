package v1.t1000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][];

        int north = Math.abs(r0 - 0);
        int south = Math.abs(r0 - R + 1);
        int east = Math.abs(c0 - C + 1);
        int west = Math.abs(c0 - 0);

        int maxDistance = 0;
        maxDistance += Math.max(north,south);
        maxDistance += Math.max(east, west);

        res[0] = new int[]{r0, c0};
        int i = 1;
        for (int d = 1; d <= maxDistance; d++) {
            for (int x = d; x >= 0; x--) {
                int y = d - x;

                int tx = c0 - x;
                if (tx >= 0) {
                    int ty = r0 - y;
                    if (ty >= 0) {
                        res[i++] = new int[]{ty, tx};
                    }

                    ty = r0 + y;
                    if (y != 0 && ty < R) {
                        res[i++] = new int[]{ty, tx};
                    }
                }


                tx = c0 + x;
                if (x != 0 && tx < C) {
                    int ty = r0 - y;
                    if (ty >= 0) {
                        res[i++] = new int[]{ty, tx};
                    }

                    ty = r0 + y;
                    if (y != 0 && ty < R) {
                        res[i++] = new int[]{ty, tx};
                    }
                }

            }
        }

        return res;

    }

}
