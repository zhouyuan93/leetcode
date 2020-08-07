package v1.t1000;

/**
 * @author yuan.zhou
 */
public class T1009 {
    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int p = N;
        int count = 0;
        while (p > 0) {
            p >>= 1;
            count++;
        }
        return N ^ ((1 << count) - 1);
    }
}
