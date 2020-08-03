package v1.mst;

/**
 * @author yuan.zhou
 */
public class MST5 {
    public int insertBits(int N, int M, int i, int j) {
        return ~(((1 << (j - i + 1)) - 1) << i) & N | M << i;
    }

}
