package v1.t0;

public class T7 {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return -1 * reverse(-x);
        }
        int res = 0;
        while (x > 0) {
            res *= 10;
            res += x % 10;
            if (res % 10 != x % 10) {
                return 0;
            }
            x /= 10;
        }

        return res;
    }
}
