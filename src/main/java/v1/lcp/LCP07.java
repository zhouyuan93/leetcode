package v1.lcp;

import java.util.*;

public class LCP07 {
    public int numWays(int n, int[][] relation, int k) {
        List<Integer>[] gamers;
        gamers = new List[n];

        for (int i = 0; i < gamers.length; i++) {
            gamers[i] = new ArrayList<>();
        }

        for (int[] rela : relation) {
            gamers[rela[0]].add(rela[1]);
        }

        int[] dp = new int[n];
        dp[0] = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        for (int i = 0; i < k; i++) {
            int size = queue.size();
            int[] next = new int[n];
            for (int j = 0; j < size; j++) {
                int x = queue.poll();
                int c = dp[x];
                for (Integer y : gamers[x]) {
                    if (next[y] == 0) {
                        queue.add(y);
                    }
                    next[y] += c;
                }
            }
            dp = next;
        }



        return dp[n - 1];

    }
}
