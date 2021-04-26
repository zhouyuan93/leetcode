package v1.mst;

public class MST10_01 {

    public void merge(int[] A, int m, int[] B, int n) {
        m--;
        n--;
        for (int i = A.length - 1; i >= 0; i--) {
            if (n < 0) {
                break;
            }
            if (m >= 0) {
                A[i] = A[m] > B[n] ? A[m--] : B[n--];
            } else {
                while (i >= 0) {
                    A[i--] = B[n--];
                }
            }
        }

    }
}
