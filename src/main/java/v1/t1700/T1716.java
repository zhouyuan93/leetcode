package v1.t1700;

public class T1716 {
    public int totalMoney(int n) {
        int t = n / 7 ;

        int res = (28 + 21 + 7 * t) * t / 2;

        int p = n % 7;
        for (int i = 1; i <= p; i++) {
            res += i + t;
        }

        return res ;

    }
}
