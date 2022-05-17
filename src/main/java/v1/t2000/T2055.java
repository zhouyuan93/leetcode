package v1.t2000;

import java.util.ArrayList;
import java.util.List;

public class T2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] res = new int[queries.length];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            return res;
        }

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int left = query[0];
            int right = query[1];
            int l = find(left, list);
            if (left > list.get(l)) {
                if (l+1 >= list.size()) {
                    continue;
                }
                l+=1;
            }
            int r = find(right, list);

            if (l < r) {
                res[i] = list.get(r) - list.get(l) - (r - l );
            }
        }

        return res;
    }

    public int find(int target, List<Integer> list) {
        int left = 0;
        int right = list.size();
        int mid;

        while (right - 1 > left) {
            mid = (left + right ) / 2;
            if (list.get(mid) <= target) {
                left = mid;
            }else{
                right = mid;
            }
        }

        return left;
    }
}
