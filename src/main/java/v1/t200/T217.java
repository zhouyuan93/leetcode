package v1.t200;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> memory = new HashSet<>();

        for (int num : nums) {
            if (memory.contains(num)) {
                return true;
            }
            memory.add(num);
        }
        return false;

    }
}
