package v1.t0;

import java.util.Arrays;

public class T56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> x[0] == y[0] ? y[1] - x[1] : x[0] - y[0]);

        int p = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[p][1] < intervals[i][0]) {
                p++;
                intervals[p][0] = intervals[i][0];
                intervals[p][1] = intervals[i][1];
            }else{
                intervals[p][1] = Math.max(intervals[i][1],intervals[p][1]);
            }
        }

        return Arrays.copyOf(intervals, p + 1);

    }
}
