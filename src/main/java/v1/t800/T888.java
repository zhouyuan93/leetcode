package v1.t800;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int sumA = 0;
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
        }
        int sumB = 0;
        for (int i = 0; i < B.length; i++) {
            sumB += B[i];
        }
        int change = (sumA - sumB) / 2;

        for (int i = 0; i < A.length ; i++) {
            int a = A[i];
            int b = a - change;
            if (Arrays.binarySearch(B, b) >= 0) {
                return new int[]{a, b};
            }
        }

        return null;
    }
}
