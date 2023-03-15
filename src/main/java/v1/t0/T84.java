package v1.t0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class T84 {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int len = heights.length;

        int[] h = new int[len + 2];

        System.arraycopy(heights,0,h,1,len);

        int res = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(0);
        for (int i = 1; i < h.length; i++) {
            while (h[i] < h[queue.peekLast()]) {
                int height = h[queue.pollLast()];
                int width = i - queue.peekLast() - 1;
                res = Math.max(res, height * width);
            }
            queue.addLast(i);
        }
        return res;
    }


    public int largestRectangleArea2(int[] heights) {
        int[] stack = new int[heights.length + 1];
        stack[0] = -1;
        int p = 0;
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            int x = heights[i];
            if (p == 0 || x > heights[stack[p]]) {
                p++;
                stack[p] = i;
            } else {
                while (p > 0 && x < heights[stack[p]]) {
                    int area = heights[stack[p]] * (i - stack[p - 1] - 1);
                    res = Math.max(res, area);
                    p--;
                }
                p++;
                stack[p] = i;
            }
        }

        int i = stack[p];
        while (p > 0) {
            int area = heights[stack[p]] * (i - stack[p - 1]);
            res = Math.max(res, area);
            p--;
        }

        return res;
    }
}
