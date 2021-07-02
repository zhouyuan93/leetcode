package v1.t1800;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T1833 {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        int sum = 0;

        for (int cost : costs) {
            if (cost > coins) {
                continue;
            }
            if (sum + cost <= coins) {
                sum+=cost;
                queue.add(cost);
            } else if (queue.peek() > cost) {
                sum -= queue.poll();
                sum += cost;
                queue.add(cost);
            }

        }

        return queue.size();

    }
}
