package v1.t700;

import java.util.ArrayDeque;
import java.util.Deque;

public class T785 {

    int p = 1;
    public boolean isBipartite(int[][] graph) {
        int[] memo = new int[graph.length];
        memo[0] = 1;

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);

        while (!deque.isEmpty()) {
            while (!deque.isEmpty()) {
                Integer x = deque.poll();
                int tag = -memo[x];
                for (int y : graph[x]) {
                    if (memo[y] == 0) {
                        deque.push(y);
                        memo[y] = tag;
                    } else if (memo[y] != -memo[x]) {
                        return false;
                    }
                }
            }
            add(deque, memo);
        }

        return true;

    }

    public void add(Deque<Integer> deque, int[] memo) {
        for (; p < memo.length; p++) {
            if (memo[p] == 0) {
                deque.add(p);
                memo[p] = 1;
                break;
            }
        }
    }
}
