package v1.t1400;

public class T1492 {
    public int kthFactor(int n, int k) {
        if (k > n) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }

        return -1;

    }
}
