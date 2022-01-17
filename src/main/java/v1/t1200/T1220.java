package v1.t1200;

public class T1220 {
    public static final int MOD = 1000000007;

    public int countVowelPermutation(int n) {
        if (n == 0) {
            return 0;
        }

        int a = 1;
        int e = 1;
        int i = 1;
        int o = 1;
        int u = 1;

        while (--n > 0) {
            int an = e;
            int en = (a + i) % MOD;
            int in = ((a + e) % MOD + (o + u) % MOD) % MOD;
            int on = (i + u) % MOD;
            int un = a;

            a = an;
            e = en;
            i = in;
            o = on;
            u = un;
        }

        return (((a + e) % MOD + (o + u) % MOD)% MOD + i) % MOD;

    }
}
