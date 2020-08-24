package v1.t400;

import java.util.Arrays;
import java.util.Date;

/**
 * @author yuan.zhou
 */
public class T459 {

    public  int[] getNextArray(String pat) {
        char[] pc = pat.toCharArray();
        int[] next = new int[pc.length];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while (i < pc.length-1) {
            if (j == -1 || pc[j] == pc[i]) {
                i++;
                j++;
                next[i] = j;
            }else{
                j = next[j];
            }
        }
        return next;
    }

    public boolean repeatedSubstringPattern(String s) {
        int[] next = getNextArray(s);

        char[] sc = s.toCharArray();
        s = s+s;
        char[] s2c = s.toCharArray();
        int p = 0;
        for (int i = 1; i < s2c.length ; ) {
            if (p==-1 || s2c[i] == sc[p]) {
                p++;
                if (p >= sc.length && i != s2c.length - 1) {
                    return true;
                }
                i++;
            }else{
                p = next[p];
            }

        }

        return false;

    }
}
