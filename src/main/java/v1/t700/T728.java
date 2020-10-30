package v1.t700;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int t = i;
            boolean flag = true;
            while (t != 0) {
                int y = t % 10;
                if (y != 0 && i % y == 0) {
                    t = t / 10;
                }else{
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res.add(i);
            }
        }
        return res;
    }
}
