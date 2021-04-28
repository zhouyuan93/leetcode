package v1.t800;

import java.util.Arrays;
import java.util.HashSet;

public class T898 {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();

        for (int y : arr) {
            HashSet<Integer> t = new HashSet<>();
            t.add(y);
            for (Integer x : temp) {
                t.add(x | y);
            }
            temp = t;

            res.addAll(temp);
        }

        return res.size();

    }
}
