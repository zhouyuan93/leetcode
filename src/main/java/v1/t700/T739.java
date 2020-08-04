package v1.t700;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yuan.zhou
 */
public class T739 {

    public int[] dailyTemperatures(int[] T) {

        if (T == null || T.length == 0) {
            return new int[0];
        }

        Deque<Integer> stack = new LinkedList<>();

        int[] res = new int[T.length];

        for (int i = 0 ; i < T.length ; i++) {
            int tempera = T[i];
            while (!stack.isEmpty() && tempera > T[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);

        }

        return res;


    }
}
