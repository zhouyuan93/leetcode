package v1.t900;

import java.util.HashSet;
import java.util.Set;

public class T961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> pool = new HashSet<>();
        int res = 0;

        for (int i = 0; i < A.length; i++) {
            if (pool.contains(A[i])) {
                res = A[i];
                break;
            }else{
                pool.add(A[i]);
            }
        }

        return res;
    }
}
