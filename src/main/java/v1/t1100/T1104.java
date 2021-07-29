package v1.t1100;

import java.util.ArrayList;
import java.util.List;

public class T1104 {

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> res = new ArrayList<>();
        int level = getLevel(label);

        res.add(label);
        int idx = (level & 1) == 1 ? label - (1 << (level - 1)) + 1 : (1 << level) - label;

        level--;
        while (level > 0) {
            idx = (idx + 1) >> 1;
            if ((level & 1) == 1) {
                res.add(0, (1 << (level - 1)) - 1 + idx);
            } else {
                res.add(0, (1 << level) - idx);
            }
            level--;
        }

        return res;

    }

    private int getLevel(int x) {
        int l = 0;
        int r = 31;
        while (l < r - 1) {
            int mid = (l + r) / 2;
            int t = (1 << mid) - 1;
            if (t > x) {
                r = mid;
            } else if (t < x) {
                l = mid;
            } else {
                return mid;
            }
        }
        return r;
    }

}
