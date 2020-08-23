package v1.t200;

/**
 * @author yuan.zhou
 */
public class T201 {
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;

        while (m < n) {
            m >>= 1;
            n >>= 1;
            i++;
        }

        return m << i;

    }
}
