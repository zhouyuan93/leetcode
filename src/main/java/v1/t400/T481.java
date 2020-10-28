package v1.t400;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T481 {
    public int magicalString(int n) {
        if (n <= 0) {
            return 0;
        }else if (n < 4) {
            return 1;
        }

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;

        int sum = 3;
        int res = 1;

        int pSlow = 1;
        int pSlowCount = 1;

        for (int i = 2; i < n; i++) {
            int x = pSlow % 2 + 1;
            arr[i] = x;

            if (i % 2 == 0) {
                res += x;
            }
            sum += x;
            if (sum == x) {
                return res;
            }else if (sum > n) {
                if (i % 2 == 0) {
                    res -= (sum - n);
                }
                return res;
            }

            pSlowCount--;
            if (pSlowCount == 0) {
                pSlow++;
                pSlowCount = arr[pSlow];
            }
        }


        return res;

    }
}
