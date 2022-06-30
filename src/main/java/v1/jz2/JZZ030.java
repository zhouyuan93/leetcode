package v1.jz2;

import java.util.*;

public class JZZ030 {
    static class RandomizedSet {
        Set<Integer> set;
        Random random;
        /**
         * Initialize your data structure here.
         */
        public RandomizedSet() {
            set = new HashSet<>();
            random = new Random();
        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain the specified element.
         */
        public boolean insert(int val) {
            return set.add(val);
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified element.
         */
        public boolean remove(int val) {
            return set.remove(val);
        }

        /**
         * Get a random element from the set.
         */
        public int getRandom() {
            int idx = random.nextInt(set.size());
            Iterator<Integer> it = set.iterator();
            int res = -1;
            while (idx-- >= 0) {
                res = it.next();
            }
            return res;
        }
    }
}
