package v1.t700;

import java.util.*;

public class T752 {

    int[] m = {1, 10, 100, 1000, 10000};

    Integer[] memo = new Integer[10000];

    public int openLock(String[] deadends, String _target) {
        memo[0] = 0;

        for (String deadend : deadends) {
            memo[Integer.valueOf(deadend)] = -1;
        }

        if(memo[0] == -1){
            return -1;
        }

        int target = Integer.valueOf(_target);

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> next = new ArrayDeque<>();
        int step = 1;
        deque.add(0);
        while (!deque.isEmpty()) {

            Integer lock = deque.poll();
            for (int i = 0; i < 4; i++) {
                int t = lock % m[i + 1] / m[i];
                int x = lock + ((t + 1) % 10 - t) * m[i];
                if (memo[x] == null) {
                    memo[x] = step;
                    next.add(x);
                }
                x = lock + ((t + 9) % 10 - t) * m[i];
                if (memo[x] == null) {
                    memo[x] = step;
                    next.add(x);
                }
            }

            if (deque.isEmpty()) {
                deque = next;
                next = new ArrayDeque<>();
                step++;
            }

            if (memo[target] != null) {
                return memo[target];
            }
        }

        return -1;

    }

}
