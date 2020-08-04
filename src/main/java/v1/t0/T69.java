package v1.t0;

/**
 * @author yuan.zhou
 */
public class T69 {
    public int mySqrt(int x) {
        //注意int类型的范围 21^31-1
        final int LARGE_RES = 46340;
        final int LARGE = LARGE_RES * LARGE_RES;

        //保证x^2不会超范围
        if (x >= LARGE) {
            return LARGE_RES;
        }

        //处理 x=0
        if (x == 0) {
            return 0;
        }

        //处理 x=1
        if (x < 4) {
            return 1;
        }

        //处理 4 <= x <= LARGE
        int minP = 0;
        int maxP = Math.min(LARGE_RES,x);
        while (minP + 1 < maxP) {
            int p = (minP + maxP) / 2;
            int squareP = p * p;
            if (squareP == x) {
                return p;
            } else if (squareP > x) {
                maxP = p;
            } else if (squareP < x) {
                minP = p;
            }
        }

        return minP;
    }
}
