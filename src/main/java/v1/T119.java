package v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        res.add(1);
        int floor = 0;
        while (floor < rowIndex) {
            res.add(1);
            for (int i = floor ; i > 0 ; i--) {
                res.set(i, res.get(i) + res.get(i - 1));
            }
            floor++;
        }
        return res;
    }
}
