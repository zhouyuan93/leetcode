package v1.t1600;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class T1654 {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int[] memo = new int[6001];
        for (int f : forbidden) {
            memo[f] = -1;
        }
        if (memo[x] == -1) {
            return -1;
        }
        if(x == 0){
            return 0;
        }

        Queue<Integer>[] queue = new Queue[2];
        queue[0] = new LinkedList<>();
        queue[1] = new LinkedList<>();


        Queue<Integer>[] queueB = new Queue[2];
        queueB[0] = new LinkedList<>();
        queueB[1] = new LinkedList<>();

        memo[0] = 2;

        int p = 0;
        int q = 1;

        queue[p].add(0);
        queueB[p].add(0);

        int step = 0;
        while (!queue[p].isEmpty()) {
            step++;

            while (!queue[p].isEmpty()) {
                int t = queue[p].poll();
                int tb = queueB[p].poll() + 1;


                int z = t + a;
                if (z == x) {
                    return step;
                }
                if (z <= (6000) && memo[z] != -1 && memo[z] != 2) {
                    memo[z] = 2;
                    queue[q].add(z);
                    queueB[q].add(0);
                }

                if (tb < 2) {
                    z = t - b;
                    if (z == x) {
                        return step;
                    }
                    if (z > 0 && memo[z] != -1 && memo[z] != 2) {
                        if (memo[z] > tb || memo[z] == 0) {
                            memo[z] = tb;
                            queue[q].add(z);
                            queueB[q].add(tb);
                        }
                    }
                }
            }

            p ^= 1;
            q ^= 1;
        }

        return -1;
    }
}
