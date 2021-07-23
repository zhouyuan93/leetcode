package v1.t1800;

import java.util.Arrays;

public class T1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        if (ranges == null || ranges.length == 0) {
            return left == 0 && right == 0;
        }
        Arrays.sort(ranges, (x, y) -> {
            if (x[0] == y[0]) {
                return y[1] - x[1];
            } else {
                return x[0] - y[0];
            }
        });

        Integer l = null;
        Integer r = null;
        int i = 0;
        for (; i < ranges.length; i++) {
            int x = ranges[i][0];
            int y = ranges[i][1];
            if (x <= left && left <= y) {
                l = x;
                r = y + 1;
                break;
            }
        }
        i++;

        if (l == null) {
            return false;
        }

        for (; i < ranges.length; i++) {
            int x = ranges[i][0];
            int y = ranges[i][1];
            if (x > r) {
                return false;
            }
            if (y < r) {
                continue;
            }
            if (r > right) {
                break;
            }
            r = y + 1;
        }

        return r > right;

    }
}
