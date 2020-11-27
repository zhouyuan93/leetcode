package v1.t400;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author yuan.zhou
 */
public class T454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                long x = A[i] + B[j];
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                long y = -C[i] - D[j];
                res += map.getOrDefault(y, 0);
            }
        }

        return res;

    }
}
