package v1.t100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);

        if (numRows == 0) {
            return res;
        }

        int floor = 0;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);

        List<Integer> f1 = new ArrayList<>();
        f1.add(1);
        res.add(f1);
        while (floor+1 < numRows) {
            temp.add(temp.get(floor));
            for (int i = floor; i > 0; i--) {
                temp.set(i, temp.get(i) + temp.get(i - 1));
            }
            List<Integer> newFloor = new ArrayList<>();
            for (Integer integer : temp) {
                newFloor.add(integer);
            }
            res.add(newFloor);
            floor++;
        }

        return res;
    }
}
