package v1.t300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class T381 {
    class RandomizedCollection {

        Map<Integer, HashSet<Integer>> map ;

        List<Integer> list;


        /**
         * Initialize your data structure here.
         */
        public RandomizedCollection() {
            map = new HashMap<>();
            list = new ArrayList<>();
        }

        /**
         * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
         */
        public boolean insert(int val) {
            HashSet<Integer> set = map.getOrDefault(val, new HashSet<>());
            set.add(list.size());
            map.put(val, set);
            list.add(val);
            return set.size() == 1;
        }

        /**
         * Removes a value from the collection. Returns true if the collection contained the specified element.
         */
        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            Iterator<Integer> it = map.get(val).iterator();
            int i = it.next();
            int last = list.get(list.size() - 1);
            list.set(i, last);
            map.get(val).remove(i);
            map.get(last).remove(list.size() - 1);
            if (i < list.size() - 1) {
                map.get(last).add(i);
            }
            if (map.get(val).size() == 0) {
                map.remove(val);
            }
            list.remove(list.size() - 1);
            return true;
        }

        /**
         * Get a random element from the collection.
         */
        public int getRandom() {
            return list.get(((int) (Math.random() * list.size())));
        }
    }

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
