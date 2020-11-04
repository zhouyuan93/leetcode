package v1.t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T57 {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][];

        int p = 0;
        boolean hasInsert = false;
        for (int i = 0; i < res.length; i++) {
            if (!hasInsert) {
                if (p == intervals.length || newInterval[LEFT] < intervals[p][LEFT]) {
                    hasInsert = true;
                    res[i] = newInterval;
                    continue;
                }
            }
            res[i] = intervals[p++];
        }

        p = 0;
        for (int i = 1; i < res.length; i++) {
            if (res[p][RIGHT] >= res[i][LEFT]) {
                res[p][RIGHT] = Math.max(res[p][RIGHT], res[i][RIGHT]);
                continue;
            }
            if (res[p][RIGHT] >= res[i][RIGHT]) {
                continue;
            }
            p++;
            res[p] = res[i];
        }

        return Arrays.copyOf(res,p+1);

    }
}
