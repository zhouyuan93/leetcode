package v1.t800;

/**
 * @author yuan.zhou
 */
public class T896 {
    public boolean isMonotonic(int[] A) {
        if (A == null || A.length < 2) {
            return true;
        }

        boolean isUp = A[0] <= A[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] == 0) {
                continue;
            }
            if (A[i + 1] > A[i] != isUp) {
                return false;
            }
        }

        return true;

    }
}
