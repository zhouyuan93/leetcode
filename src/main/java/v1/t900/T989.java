package v1.t900;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int upper = 0;
        A[A.length-1] += K;
        for (int i = A.length - 1; i >= 0; i--) {
            A[i] += upper;
            if (A[i] > 9) {
                upper = A[i] / 10;
                A[i] %= 10;
            }else{
                upper = 0;
            }
            if (upper == 0) {
                break;
            }
        }
        List<Integer> list = new ArrayList<>();
        while (upper > 0) {
            list.add(0, upper % 10);
            upper /= 10;
        }
        for (int i : A) {
            list.add(i);
        }
        return list;

    }
}
