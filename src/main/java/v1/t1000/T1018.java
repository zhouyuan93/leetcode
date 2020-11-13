package v1.t1000;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int x = 0;

        List<Boolean> res = new ArrayList<>(A.length);
        for (int i : A) {
            x = ((x << 1) + i) % 5;
            res.add(x == 0);
        }

        return res;

    }
}
