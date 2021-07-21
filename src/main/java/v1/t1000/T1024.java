package v1.t1000;

import java.util.Arrays;
import java.util.Comparator;

public class T1024 {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips, Comparator.comparingInt(a -> a[0]));
        if (clips[0][0] > 0) {
            return -1;
        }

        int right = 0;
        int nextRight = 0;
        int step = 1;
        for (int i = 0; i < clips.length; i++) {
            int[] c = clips[i];
            if (c[0] <= right) {
                nextRight = Math.max(c[1], nextRight);
                if (nextRight >= time) {
                    return step;
                }
            } else {
                if (nextRight >= c[0]) {
                    right = nextRight;
                    nextRight = c[1];
                    step++;
                    if (nextRight >= time) {
                        return step;
                    }
                } else {
                    break;
                }
            }
        }

        return -1;
    }


}
