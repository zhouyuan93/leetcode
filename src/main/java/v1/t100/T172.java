package v1.t100;

/**
 * @author yuan.zhou
 */
public class T172 {
    public int trailingZeroes(int n) {
        int x = n;
        int res = 0;
        while (x > 0) {
            x = x / 5;
            res += x;
        }
        return res;
    }
}
