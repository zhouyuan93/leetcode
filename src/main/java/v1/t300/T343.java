package v1.t300;

public class T343 {
    public int integerBreak(int n) {
        if (n < 3) {
            return 1;
        }

        if (n == 3) {
            return 2;
        }

        int x = n / 3;
        int y = n % 3;

        if (y == 1) {
            return (int) (Math.pow(3, x - 1) * 4);
        } else if (y == 0) {
            return (int) (Math.pow(3, x));
        } else {
            return (int) (Math.pow(3, x) * y);
        }
    }
}
