package v1.t400;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T455 {
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || g.length == 0 || s == null || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int ig = 0, is = 0; ig < g.length && is < s.length; ig++) {
            while (s[is] < g[ig]) {
                is++;
                if (is >= s.length) {
                    return res;
                }
            }
            res++;
            is++;
        }
        return res;
    }
}
