package v1.t0;

import java.util.ArrayList;
import java.util.List;

public class T89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) {
            res.add(0);
            res.add(1);
            return res;
        }

        List<Integer> before = grayCode(n - 1);
        res.addAll(before);
        int y = 1 << (n-1);
        for (int i = before.size() - 1; i >= 0; i--) {
            Integer x = before.get(i);
            res.add(y | x);
        }

        return res;
    }
}
