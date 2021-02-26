package v1.t1100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1441 {
    public static final String PUSH = "Push";
    public static final String POP = "Pop";

    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();

        int p = 0;
        for (int i = 1; i <= n && p < target.length; i++) {
            ans.add(PUSH);
            if (target[p] != i) {
                ans.add(POP);
            }else{
                p++;
            }
        }

        return ans;
    }
}
