package v1.t1500;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1561 {
    public int maxCoins(int[] piles) {
        if (piles == null || piles.length == 0) {
            return 0;
        }

        Arrays.sort(piles);

        int res = 0;
        int left = 0;
        int right = piles.length-1;

        while (left < right) {
            left++;
            right--;
            res += piles[right--];
        }

        return res;

    }
}
