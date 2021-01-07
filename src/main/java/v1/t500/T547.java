package v1.t500;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T547 {
    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null || isConnected.length == 0) {
            return 0;
        }
        for (int y = 0; y < isConnected.length; y++) {
            if (isConnected[y][y] == 0) {
                continue;
            }
            isConnected[y][y] = -1;
            for (int x = y + 1; x < isConnected[y].length; x++) {
                if (isConnected[y][x] > 0) {
                    clean(isConnected, x);
                }
            }
        }
        int res = 0;
        for (int y = 0; y < isConnected.length; y++) {
            res -= isConnected[y][y];
        }
        return res;
    }

    public void clean(int[][] isConnected, int x) {
        if (isConnected[x][x] == 0 || isConnected[x][x] == -1) {
            return;
        }
        isConnected[x][x] = 0;
        for (int i = 0; i < isConnected[x].length; i++) {
            if (isConnected[x][i] > 0) {
                clean(isConnected,i);
            }
        }
    }


}
