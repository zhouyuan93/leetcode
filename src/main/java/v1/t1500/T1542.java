package v1.t1500;

import java.util.Arrays;
import java.util.HashMap;

public class T1542 {
    public int longestAwesome(String s) {
        int res = 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - '0';
            int y = 1 << x;
            temp ^= y;

            for (int j = 0; j < 10; j++) {
                int t = temp ^ (1 << j);
                if (map.containsKey(t)) {
                    res = Math.max(i - map.get(t), res);
                }
            }

            if (map.containsKey(temp)) {
                res = Math.max(i - map.get(temp), res);
            }else {
                map.put(temp, i);
            }

        }

        return res;
    }

}
