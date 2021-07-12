package weekend.d20210711;

public class T3 {
    public static final int MOD = 1_000_000_007;

    public int colorTheGrid(int m, int n) {
        if (m == 1) {
            long res = 3;
            for (int i = 1; i < n; i++) {
                res *= 2;
                res %= MOD;
            }
            return (int) res;
        }

        if (m == 2) {
            long res = 6;
            for (int i = 1; i < n; i++) {
                res *= 3;
                res %= MOD;
            }
            return (int) res;
        }

        if (m == 3) {
            int ABC = 6, ABA = 6;
            int mod = 1_000_000_007;
            for (int i = 1; i < n; ++i) {
                int temp = ABC;
                ABC = (int) ((ABC * 2L + ABA * 2L) % mod);
                ABA = (int) ((temp * 2L + ABA * 3L) % mod);
            }
            return (int) (ABC + ABA) % mod;
        }

        if (m == 4) {
            int mod = 1_000_000_007;
            int ABC = 6, ABA = 6;

            for (int i = 1; i < n; i++) {
                int temp = ABC;
                ABC = (int) ((ABC * 2L + ABA * 2L) * 2l % mod);
                ABA = (int) ((temp * 2L + ABA * 3L) * 2l % mod);
            }
            return (int) (ABC + ABA) % mod;
        }

        if (m == 5) {
            int mod = 1_000_000_007;
            int ABC = 6, ABA = 6;

            for (int i = 1; i < n; i++) {
                int temp = ABC;
                ABC = (int) ((ABC * 2L + ABA * 2L) * 4  % mod);
                ABA = (int) ((temp * 2L + ABA * 3L) * 3 % mod);
            }
            return (int) ((ABC + ABA) ) % mod;

        }

        return 0;

    }



}
