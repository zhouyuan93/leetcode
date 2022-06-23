package v1.t1300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class T1380 {

    public List<Integer> luckyNumbers(int[][] matrix) {

        int[] min = new int[matrix.length];
        Arrays.fill(min,Integer.MAX_VALUE);
        int[] max = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int x = matrix[i][j];
                min[i] = Math.min(min[i], x);
                max[j] = Math.max(max[j], x);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < max.length; i++) {
            set.add(max[i]);
        }
        List<Integer> res = new ArrayList<>();

        for (int x : min) {
            if (set.contains(x)) {
                res.add(x);
            }
        }

        return res;


    }
}
