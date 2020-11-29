package v1.t900;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T976 {
    public int largestPerimeter(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        int a = A[A.length - 1];
        int b = A[A.length - 2];
        for (int i = A.length - 3; i >= 0; i--) {
            int c = A[i];
            if (isTriangle(a, b, c)) {
                return a + b + c;
            }else{
                a = b;
                b = c;
            }
        }

        return 0;

    }

    public boolean isTriangle(int a, int b, int c) {
        return b + c > a;
    }
}
