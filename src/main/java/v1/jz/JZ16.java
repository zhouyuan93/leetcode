package v1.jz;

public class JZ16 {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }

        long b = n;

        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        double res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }

        return res;
    }
}
