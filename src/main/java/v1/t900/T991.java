package v1.t900;

/**
 * @author yuan.zhou
 */
public class T991 {
    public int brokenCalc(int X, int Y) {

        if (X == Y) {
            return 0;
        } else if (X > Y) {
            return X - Y;
        } else {
            int doubleCount = 0;
            while (X < Y) {
                X <<= 1;
                doubleCount++;
            }
            return brokenCalc(X, Y, doubleCount) + doubleCount;

        }

    }

    public int brokenCalc(int x, int y, int doubleCount) {
        int diff = x - y;

        int res = 0;
        while (diff != 0 && doubleCount != 0) {
            if (diff % 2 == 1) {
                res++;
            }
            diff >>= 1;
            doubleCount--;
        }

        if (doubleCount == 0) {
            res += diff;
        }

        return res;

    }
}
