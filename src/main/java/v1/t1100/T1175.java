package v1.t1100;

public class T1175 {
    public static final int MOD = (int) 1e9 + 7;

    public int numPrimeArrangements(int n) {
        if (n == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        int t = n - count;
        long res = 1;
        for (int i = count; i > 0; i--) {
            res *= i;
            res %= MOD;
        }
        for (int i = t; i > 0; i--) {
            res *= i;
            res %= MOD;
        }

        return (int) res;

    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3 || n == 5) {
            return true;
        }
        int t = n >> 1;
        for (int i = 2; i <= t; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
