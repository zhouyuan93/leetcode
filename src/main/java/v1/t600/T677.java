package v1.t600;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T677 {
    public static class MapSum {
        HashMap<String , Integer> map;

        /** Initialize your data structure here. */
        public MapSum() {
            map = new HashMap<>();
        }

        public void insert(String key, int val) {
            map.put(key, val);
        }

        public int sum(String prefix) {
            int sum = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getKey().startsWith(prefix)) {
                    sum += entry.getValue();
                }
            }
            return sum;
        }
    }
}
