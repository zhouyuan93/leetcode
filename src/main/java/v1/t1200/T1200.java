package v1.t1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int key = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            int x = arr[i];
            int y = arr[j];
            if (y - x < key) {
                res.clear();
                key = y-x;
                res.add(Arrays.asList(x, y));
            } else if (y - x == key) {
                res.add(Arrays.asList(x, y));
            }
        }

        return res;

    }
}
