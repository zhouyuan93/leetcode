package v1.t300;

/**
 * @author yuan.zhou
 */
public class T357 {
    final static int[] calcNum = {1, 9, 72, 504, 3024, 15120, 60480, 181440, 362880, 362880};

    public int countNumbersWithUniqueDigits(int n) {
        int res = 0;
        n = Math.min(n, 10);
        for (int len = 1; len <= n; len++) {
            res += countNum(len);
        }
        return res + 1;
    }

    public int countNum(int n) {
        return 9 * calcNum[n - 1];
    }

}
