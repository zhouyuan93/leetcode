package v1.t900;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class T909 {
    int len;

    public int snakesAndLadders(int[][] board) {
        len = board.length;
        int target = len * len;

        Integer[] res = new Integer[target + 1];
        int[] trans = new int[target + 1];
        Arrays.fill(trans, -1);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == -1) {
                    continue;
                }
                int x = getTrans(i, j);
                trans[x] = board[i][j];
            }
        }

        res[1] = 0;
        Deque<Integer>[] deques = new Deque[2];
        deques[0] = new ArrayDeque<>();
        deques[1] = new ArrayDeque<>();
        int p = 0;
        int q = 1;

        deques[p].add(1);

        int step = 1;
        while (!deques[p].isEmpty()) {
            while (!deques[p].isEmpty()) {
                Integer m = deques[p].poll();

                for (int i = 1; i <= 6 && i <= target - m; i++) {
                    int n = m + i;
                    if (res[n] == null) {
                        if (n == target) {
                            return step;
                        }
                        res[n] = step;


                        int b = trans[n];
                        if (b == target) {
                            return step;
                        }
                        if (b != -1) {
                            if (res[b] == null) {
                                if (trans[b] == -1) {
                                    res[b] = step;
                                }
                                deques[q].push(b);
                            }
                        } else {
                            deques[q].push(n);
                        }

                    }

                }

            }

            p ^= 1;
            q ^= 1;
            step++;
        }

        return -1;
    }

    public int getTrans(int i, int j) {
        int y = len - i;
        int x = j + 1;
        if ((y & 1) == 0) {
            x = len - j;
        }
        x += (y-1) * len;
        return x;
    }

}
