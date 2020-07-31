package v1;

/**
 * @author yuan.zhou
 */
public class T1359 {
    public static int MOD = 1000000007;

    public int countOrders(int n) {

        long res = 1;

        for (int i = 2; i <= n; i++) {
            int x = 2 * (i - 1) + 1;
            int y = x * (x - 1) / 2 + x;
            res = (y * res) % MOD;
        }

        return (int) res;

    }


}

