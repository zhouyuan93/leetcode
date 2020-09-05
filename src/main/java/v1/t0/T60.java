package v1.t0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T60 {

    public String getPermutation(int n, int k) {
        k = k-1;
        int len = 1;
        List<Integer> memory = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            memory.add(i);
            len *= i;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n ; i > 0; i--) {
            len /= i;
            int x = k / len;
            k = k % len;
            sb.append(memory.remove(x));
        }
        return sb.toString();
    }

}
