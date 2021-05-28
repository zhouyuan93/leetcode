package v1.t1600;

import java.util.Arrays;
import java.util.Comparator;

public class T1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(point -> point[0]));

        int res = 0;
        int x = points[0][0];
        for (int i = 1; i < points.length; i++) {
            int y = points[i][0];
            if (x == y) {
                continue;
            }
            int diff = y - x;
            if (diff > res) {
                res = diff;
            }
            x = y;
        }

        return res;
    }
}
