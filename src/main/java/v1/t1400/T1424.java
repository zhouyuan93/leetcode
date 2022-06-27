package v1.t1400;

import sun.nio.cs.ext.MacHebrew;

import java.util.ArrayList;
import java.util.List;

public class T1424 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        List<List<Integer>> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> num = nums.get(i);
            count += num.size();
            for (int j = 0; j < num.size(); j++) {
                int id = i + j;
                if (list.size() == id) {
                    list.add(new ArrayList<>());
                }
                list.get(id).add(num.get(j));
            }
        }

        int[] res = new int[count];
        int p = 0;
        for (List<Integer> l : list) {
            for (int i = l.size() - 1; i >= 0; i--) {
                res[p++] = l.get(i);
            }
        }

        return res;
    }
}
