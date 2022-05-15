package weekend.d20220515.templ;

import java.util.Arrays;

public class T2 {
    public int maxConsecutive(int bottom, int top, int[] special) {

        Arrays.sort(special);

       int res = 0;
        int before = bottom;

        for (int i = 0; i < special.length; i++) {
            int x = special[i];
            int t = x - before;
            res = Math.max(res, t);
            before = x + 1;
        }

        int t = top - before + 1;
        res = Math.max(res, t);

        return res;
    }
}
