package v1.t500;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author yuan.zhou
 */
public class T539 {
    public int findMinDifference(List<String> timePoints) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (String timePoint : timePoints) {
            queue.add(parse(timePoint));
        }

        int res = 720;

        int min = queue.poll();

        int x = min;
        int y = -1;
        while (!queue.isEmpty()) {
            y = queue.poll();
            res = Math.min(res, y - x);
            x = y;
            if (res == 0) {
                return 0;
            }
        }

        res = Math.min(res, min + 1440 - y);

        return res;

    }

    public int parse(String timePoint) {
        int i = Integer.valueOf(timePoint.substring(0, 2));
        int j = Integer.valueOf(timePoint.substring(3, 5));
        return i*60 + j;
    }
}
