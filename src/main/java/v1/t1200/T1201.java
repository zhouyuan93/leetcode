package v1.t1200;

public class T1201 {
    long a;
    long b;
    long c;
    long ab;
    long ac;
    long bc;
    long abc;

    public int nthUglyNumber(int n, int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = 1L * a * b / getGcd(a,b);
        ac = 1L * a * c / getGcd(a,c);
        abc = ab * c / getGcd(ab,c);
        bc = 1L * b * c / getGcd(b,c);

        long l = 1;
        long r = (int) 2e9 + 1;
        while (l < r) {
            long mid = (l + r) / 2;
            long index = getIndex(mid);
            if (index >= n) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return (int) l;
    }

    public long getIndex(long x) {
        long t = x / a + x / b + x / c - x / ab - x / ac - x / bc + x / abc;
        return t;
    }

    public long getGcd(long a, long b) {
        if (a > b) {
            return getGcd(b, a);
        }
        long x = b % a;
        while (x != 0) {
            b = a;
            a = x;
            x = b % a;
        }
        return a;
    }
}
