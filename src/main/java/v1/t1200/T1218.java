package v1.t1200;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T1218 {

    public int longestSubsequence(int[] arr, int difference) {
        int res = 0;
        Map<Integer, Integer> upMap = new HashMap<>(2 * arr.length);
        for (int x : arr) {
            int upBefore = x - difference;
            int upTemp = Math.max(upMap.getOrDefault(x, 1), upMap.getOrDefault(upBefore,0) + 1);
            res = Math.max(upTemp, res);
            upMap.put(x, upTemp);

        }
        return res ;
    }
}
