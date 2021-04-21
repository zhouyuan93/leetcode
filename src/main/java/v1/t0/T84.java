package v1.t0;

public class T84 {
    public int largestRectangleArea(int[] heights) {
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
