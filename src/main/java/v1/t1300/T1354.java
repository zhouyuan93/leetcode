package v1.t1300;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T1354 {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());

        int sum = 0;
        for (int i = target.length - 1; i >= 0; i--) {
            queue.add(target[i]);
            sum += target[i];
        }
        while (queue.peek() != 1) {
            int x = queue.poll();
            int other = sum - x;
            if (other >= x) {
                return false;
            }
            int y = (sum - 1) % other + 1;
            sum = other + y;
            queue.add(y);
        }

        return true;

    }
}
