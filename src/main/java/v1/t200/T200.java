package v1.t200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T200 {
    public int numIslands(char[][] grid) {
        int newColor = 1;

        Map<Integer, Integer> trans = new HashMap<>();

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                //海不做处理
                if (grid[y][x] == '0') {
                    continue;
                }

                //岛屿, 取上 左两块
                int up = 0;
                int left = 0;
                if (y > 0) {
                    up = grid[y - 1][x] - '0';
                }
                if (x > 0) {
                    left = grid[y][x - 1] - '0';
                }

                if (up == 0 && left == 0) {
                    newColor++;
                    grid[y][x] = (char) (newColor + '0');
                    continue;
                }

                if (up == 0 && left != 0) {
                    grid[y][x] = (char) (left + '0');
                    continue;
                }

                if (up != 0 && left == 0) {
                    grid[y][x] = (char) (up + '0');
                    continue;
                }

                //最后一种 up left 两个颜色不相同, 需要merge
                while (trans.containsKey(up)) {
                    up = trans.get(up);
                }
                while (trans.containsKey(left)) {
                    left = trans.get(left);
                }

                if (up != left) {
                    if (up > left) {
                        up ^= left;
                        left ^= up;
                        up ^= left;
                    }

                    trans.put(left, up);
                }

                grid[y][x] = (char) (up + '0');

            }
        }

        return newColor - 1 - trans.size();

    }
}
