package v1.t1000;

/**
 * @author yuan.zhou
 */
public class T1016 {
    public boolean queryString(String S, int N) {
        int len = Integer.toBinaryString(N).length();
        int p = 1 << (len-1);
        int min = N - p + 1;
        for (int i = N; i >= min; i--) {
            if (S.indexOf(Integer.toBinaryString(i)) < 0) {
                return false;
            }
        }
        return true;
    }
}
