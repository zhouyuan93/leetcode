package v1.t700;

import java.math.BigDecimal;

/**
 * @author yuan.zhou
 */
public class T738 {
    public int monotoneIncreasingDigits(int N) {
        if (N < 10) {
            return N;
        }

        int len = stringSize(N);

        int[] arrayN = new int[len];
        for (int i = 0; i < len; i++) {
            int x = N % 10;
            arrayN[len - 1 - i] = x;
            N /= 10;
        }

        boolean removeOne = false;

        for (int i = 1; i < arrayN.length; i++) {
            if (!removeOne) {
                if (arrayN[i] - arrayN[i - 1] >= 0) {
                    continue;
                }else{
                    int p = i-1;
                    while (p-1 >= 0 && arrayN[p] - arrayN[p - 1] <= 0 ) {
                        p--;
                    }
                    removeOne = true;
                    arrayN[p]--;
                    i = p;
                }
            }else{
                arrayN[i] = 9;
            }
        }

        int res = 0;
        for (int i = 0; i < arrayN.length; i++) {
            int x = arrayN[i];
            res *= 10;
            res += x;
        }

        return res;
    }


    public int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE};

    public int stringSize(int x) {
        for (int i = 0; ; i++) {
            if (x <= sizeTable[i]) {
                return i + 1;
            }
        }
    }
}
