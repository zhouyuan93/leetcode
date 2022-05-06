package v1.t900;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yuan.zhou
 */
public class T933 {
    public static class RecentCounter{

        Queue<Integer> queue;

        public RecentCounter(){
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            while (queue.size() > 0 && queue.peek() < t - 3000) {
                queue.poll();
            }
            queue.add(t);
            return queue.size();
        }
    }

    public static class RecentCounter2{

        Queue<Integer> queue;


        public RecentCounter2() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.offer(t);
            while (queue.peek() < t-3000)  {
               queue.poll();
            }
            return queue.size();
        }

    }
}
