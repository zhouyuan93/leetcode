package v1;

import java.util.HashMap;
import java.util.Map;

public class T873 {
    public int lenLongestFibSubseq(int[] A) {
        Map<Integer, Integer> memory = new HashMap<Integer, Integer>((int) (A.length / 0.75) + 1);
        for (int i : A) {
            memory.put(i, 1);
        }

        int res = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int x = A[j], y = A[i] + A[j];
                int length = 2;
                while (memory.containsKey(y)) {
                    int z = x + y;
                    x = y;
                    y = z;
                    res = Math.max(res, ++length);
                }

            }
        }

        return res > 2 ? res : 0;

    }
}
