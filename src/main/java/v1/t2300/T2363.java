package v1.t2300;

import java.util.*;

public class T2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1, Comparator.comparingInt(p -> p[0]));
        Arrays.sort(items2, Comparator.comparingInt(p -> p[0]));

        List<List<Integer>> list = new ArrayList<>();

        int p = 0;
        int q = 0;
        while (p < items1.length || q < items2.length) {
            int[] t1 = null;
            if (p < items1.length) {
                t1 = items1[p];
            }

            int[] t2 = null;
            if (q < items2.length) {
                t2 = items2[q];
            }

            if (t1 != null && t2 != null) {
                if (t1[0] == t2[0]) {
                    list.add(Arrays.asList(t2[0], t2[1] + t1[1]));
                    q++;
                    p++;
                } else if (t1[0] > t2[0]) {
                    list.add(Arrays.asList(t2[0], t2[1]));
                    q++;
                } else {
                    list.add(Arrays.asList(t1[0], t1[1]));
                    p++;
                }
            } else if (t1 != null) {
                list.add(Arrays.asList(t1[0], t1[1]));
                p++;
            } else {
                list.add(Arrays.asList(t2[0], t2[1]));
                q++;
            }
        }

        return list;

    }
}
