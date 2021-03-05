package v1.t900;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author yuan.zhou
 */
public class T981 {
    static class TimeMap {

        /**
         * Initialize your data structure here.
         */

        class ValTime{
            String val;
            int time;

            public ValTime(String val, int time) {
                this.val = val;
                this.time = time;
            }
        }

        Map<String, List<ValTime>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            ValTime valTime = new ValTime(value, timestamp);
            if (map.containsKey(key)) {
                List<ValTime> list = map.get(key);
                int index = findLessOrEqual(list, timestamp);
                if (list.get(index).time == timestamp) {
                    list.get(index).val = value;
                }else{
                    list.add(index+1, valTime);
                }
            }else{
                List<ValTime> list = new ArrayList<>();
                list.add(valTime);
                map.put(key, list);
            }
        }

        public String get(String key, int timestamp) {
            if (map.containsKey(key)) {
                List<ValTime> list = map.get(key);
                int index = findLessOrEqual(list, timestamp);
                ValTime valTime = list.get(index);
                if (valTime.time <= timestamp) {
                    return valTime.val;
                }
                index--;
                if (index < 0) {
                    return "";
                }
                valTime = list.get(index);
                return valTime.val;
            }else{
                return "";
            }
        }

        public int findLessOrEqual(List<ValTime> list, int timesTamp) {
            int left = 0;
            int right = list.size()-1;
            while (left + 1 < right) {
                int mid = (left + right) / 2;
                if (list.get(mid).time >= timesTamp) {
                    right = mid;
                }else{
                    left = mid;
                }
            }
            if (list.get(right).time <= timesTamp) {
                return right;
            }
            return left;
        }
    }
}
