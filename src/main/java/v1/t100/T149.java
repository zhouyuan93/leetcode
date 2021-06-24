package v1.t100;

import java.util.HashMap;
import java.util.Map;

public class T149 {
    public int maxPoints(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        int res = 1;

        for (int i = 0; i < points.length; i++) {
            int[] m = points[i];
            Map<String, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length ; j++) {
                int[] n = points[j];
                double k;
                String key;
                if (m[0] == n[0]) {
                    key = String.valueOf(m[0]);
                } else {
                    k =(double) (m[1] - n[1]) /(double) (m[0] - n[0]) + 0.0;
                    double zero = m[1] - k * m[0];
                    key = zero + "&" + k;
                }

                Integer val = map.getOrDefault(key, 1);
                val++;
                if (val > res) {
                    res = val;
                }

                map.put(key, val);
            }
        }

        return res;

    }
}
