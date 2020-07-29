package v1;

public class T396 {
    public int maxRotateFunction(int[] A) {
        int sum = 0;
        int f0 = 0;
        for (int i = 0; i < A.length; i++) {
            int p = A[i];
            sum += p;
            f0 += i * p;
        }

        int res = f0;
        int len = A.length ;
        for (int i = A.length - 1; i >= 0; i--) {
            f0 = f0 + sum - A[i] * len;
            res = Math.max(res, f0);
        }

        return res;

    }
}
