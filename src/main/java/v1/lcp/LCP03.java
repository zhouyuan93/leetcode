package v1.lcp;

import java.util.Arrays;

public class LCP03 {
    public boolean robot(String command, int[][] obstacles, int x, int y) {
        if (command.length() <= 0) {
            return false;
        }

        int len = command.length();
        int[] u = new int[len];
        int[] r = new int[len];

        int sumU = 0;
        int sumR = 0;

        for (int i = 0; i < len; i++) {
            char c = command.charAt(i);
            if (c == 'U') {
                sumU++;
            } else {
                sumR++;
            }
            u[i] = sumU;
            r[i] = sumR;
        }

        if (!canMove(x, y, r, u)) {
            return false;
        }


        for (int[] obstacle : obstacles) {
            int or = obstacle[0];
            int ou = obstacle[1];
            if (or > x || ou > y) {
                continue;
            }

            if (canMove(or, ou, r, u)) {
                return false;
            }

        }


        return true;
    }

    boolean canMove(int x, int y, int[] r, int[] u) {
        int n = Math.min(x / r[r.length - 1], y / u[u.length - 1]);
        int tx = x;
        int ty = y;
        tx -= n * r[r.length - 1];
        ty -= n * u[u.length - 1];
        if (tx == 0 && ty == 0) {
            return true;
        }

        int ti = Arrays.binarySearch(r, tx);
        int tj = Arrays.binarySearch(u, ty);
        if (ti < 0) {
            return false;
        }
        if (tj < 0) {
            return false;
        }
        if (r[tj] != tx && u[ti] != ty) {
            return false;
        }
        return true;
    }
}
