package weekend.d20210704;

import java.util.HashMap;

public class T3 {
    HashMap<Long, Long> memo = new HashMap<>();
    {
        memo.put(1l, 5l);
        memo.put(2l, 20l);
        memo.put(0l, 0l);
    }
    int mod = 1_000_000_007;
    int[] x = {5, 4};

    public int countGoodNumbers(long n) {
        return (int) get(n);
    }

    public long get(long n) {

        if (memo.containsKey(n)) {
            return memo.get(n).intValue();
        }

        long x = n / 2;
        if ((x & 1) == 1l) {
            x++;
        }
        long y = n - x;
        long res = get(x) * get(y);
        res %= mod;
        memo.put(n, res);

        return (int) res;

    }

    public int t2(long n) {
        if (n == 0) {
            return 0;
        }
        int mod = 1_000_000_007;
        long res = 1;
        int[] x = {5, 4};
        int p = 0;
        for (long i = 0; i < n; i++) {
            res *= x[(int) (i&1)];
            res %= mod;
        }

        return (int) res;
    }
}
