package v1.t1600;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author yuan.zhou
 */
public class T1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        Queue<Integer> queue = new PriorityQueue<>();

        int res = 0;
        int p = heights[0];
        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - p;

            if (diff <= 0) {
                res++;
                p = heights[i];
                continue;
            }

            queue.add(diff);

            if (queue.size() <= ladders) {
                res++;
                p = heights[i];
                continue;
            }

            int brick = queue.poll();
            bricks -= brick;
            if (bricks < 0) {
                break;
            }
            res++;
            p = heights[i];
        }


        return res;

    }
}
