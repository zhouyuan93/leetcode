package v1.t1000;

import java.util.Arrays;

public class T1051 {
    public int heightChecker(int[] heights) {
        int[] sort = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sort);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sort[i]) {
                count++;
            }
        }
        return count;
    }
}
