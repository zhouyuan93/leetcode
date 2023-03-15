package v1.t0;

import java.util.ArrayDeque;
import java.util.Deque;

public class T85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int res = 0;

        int len = matrix[0].length;

        int hLen = len + 2;

        int[] h = new int[hLen];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0') {
                    h[j + 1] = 0;
                }else{
                    h[j + 1] += 1;
                }
            }

            Deque<Integer> queue = new ArrayDeque<>();
            queue.addLast(0);

            for (int j = 1; j < hLen; j++) {
                while (h[j] < h[queue.peekLast()]) {
                    int height = h[queue.pollLast()];
                    int width = j - queue.peekLast() - 1;
                    res = Math.max(res, height * width);
                }
                queue.addLast(j);
            }

        }

        return res;


    }

}
