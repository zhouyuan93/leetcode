package v1;

import java.util.ArrayList;
import java.util.List;

public class T29 {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 2;

        T29 t = new T29();
        int res = t.divide(dividend, divisor);
        System.out.println(res);

    }

    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        boolean f = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        if (ldividend < ldivisor) {
            return 0;
        }

        List<long[]> memory = new ArrayList<>();
        long p = ldivisor;
        long count = 1;
        long res = 0;
        while (p <=ldividend) {
            memory.add(0, new long[]{p, count});
            p += p;

            count += count;
        }
        for (long[] m : memory) {
            if (m[0] <= ldividend) {
                ldividend -= m[0];

                res += m[1];
            }
            if (ldividend < ldivisor) {
                break;
            }
        }
        res = f ? -res : res;
        if (res > Integer.MAX_VALUE) {
            res = Integer.MAX_VALUE;
        }

        return (int) res;

    }
}
