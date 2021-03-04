package v1.t300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yuan.zhou
 */
public class T354 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] dp = new int[envelopes.length];
        int res = 0;
        for (int i = 0; i < envelopes.length; i++) {
            int index = Arrays.binarySearch(dp, 0, res, envelopes[i][1]);
            if (index < 0) {
                index = - index - 1;
            }
            dp[index] = envelopes[i][1];
            if (index == res) {
                res++;
            }
        }
        return res;
    }

}
