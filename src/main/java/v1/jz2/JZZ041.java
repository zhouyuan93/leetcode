package v1.jz2;

import java.util.ArrayDeque;
import java.util.Queue;

public class JZZ041 {

    class MovingAverage {

        double sum = 0;
        Queue<Integer> queue ;
        int size;

        public MovingAverage(int size) {
            this.size = size;
            queue = new ArrayDeque<>(size);
        }

        public double next(int val) {
            if (queue.size() == size) {
                sum -= queue.poll();
            }
            queue.offer(val);
            sum += val;
            return sum / queue.size();
        }


    }


}
