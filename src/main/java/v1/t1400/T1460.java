package v1.t1400;

import java.util.PriorityQueue;

public class T1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (arr.length != target.length) {
            return false;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < target.length; i++) {
            queue.add(target[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!queue.remove(Integer.valueOf(arr[i]))) {
                return false;
            }
        }
        return true;
    }
}
