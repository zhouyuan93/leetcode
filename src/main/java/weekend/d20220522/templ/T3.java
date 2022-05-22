package weekend.d20220522.templ;

import java.util.Arrays;
import java.util.Comparator;

public class T3 {
    public int minimumLines(int[][] stockPrices) {
        if (stockPrices.length == 0) {
            return 0;
        }
        if (stockPrices.length == 2) {
            return 1;
        }

        Arrays.sort(stockPrices, Comparator.comparingInt(a -> a[0]));

        int res = 1;
        for (int i = 2; i < stockPrices.length; i++) {
            int[] p1 = stockPrices[i - 2];
            int[] p2 = stockPrices[i - 1];
            int[] p3 = stockPrices[i];
            if (!isSameK(p1[0], p1[1], p2[0], p2[1], p3[0], p3[1])) {
                res++;
            }
        }

        return res;
    }

    public boolean isSameK(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y1 - y2) * (x2 - x3) == (y2 - y3) * (x1 - x2);
    }
}
