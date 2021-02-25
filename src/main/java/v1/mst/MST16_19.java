package v1.mst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class MST16_19 {
    public int[] pondSizes(int[][] land) {
        int yLen = land.length;
        int xLen = land[0].length;

        List<Integer> res = new ArrayList<>();
        for (int y = 0; y < yLen; y++) {
            for (int x = 0; x < xLen; x++) {
                if (land[y][x] == 0) {
                    res.add(getSize(land, x, y));
                }
            }
        }

        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        Arrays.sort(array);

        return array;

    }

    public int getSize(int[][] land, int x , int y) {
        if (x >= land[0].length || x < 0 || y >= land.length || y < 0 || land[y][x] > 0) {
            return 0;
        }
        land[y][x] = 1;
        return 1 + getSize(land, x + 1, y) + getSize(land, x + 1, y + 1) + getSize(land, x+1, y - 1)
                + getSize(land, x, y + 1) + getSize(land, x, y - 1)
                + getSize(land, x - 1, y) + getSize(land, x - 1, y + 1) + getSize(land, x - 1, y - 1);
    }
}
