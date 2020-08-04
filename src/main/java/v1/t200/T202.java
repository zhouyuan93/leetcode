package v1.t200;

import java.util.HashMap;

/**
 * @author yuan.zhou
 */
public class T202 {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        return isHappy(n, new HashMap<>());
    }

    public boolean isHappy(int n, HashMap<Integer, Boolean> hm) {
        System.out.println(n);
        if (n == 1) {
            return true;
        }
        if (hm.containsKey(n)) {
            return false;
        }
        hm.put(n, true);
        int next = 0;
        while (n > 0) {
            next += Math.pow(n % 10, 2);
            n = n /10;
        }
        return isHappy(next, hm );
    }
}
