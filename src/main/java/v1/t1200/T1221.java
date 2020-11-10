package v1.t1200;

/**
 * @author yuan.zhou
 */
public class T1221 {
    public int balancedStringSplit(String s) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count += c == 'L' ? -1 : 1;
            if (count == 0) {
                res++;
            }
        }

        return res;
    }
}
