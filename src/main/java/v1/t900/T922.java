package v1.t900;

/**
 * @author yuan.zhou
 */
public class T922 {
    public int[] sortArrayByParityII(int[] A) {
        if (A.length < 2) {
            return A;
        }

        int p = 0;
        int q = 1;

        for (int i = 0; i < A.length; ) {
            int x = A[i];
            if (x % 2 != i % 2) {
                if (x % 2 == 1) {
                    swap(A, i, q);
                    q += 2;
                } else if (x % 2 == 0) {
                    swap(A, i, p);
                    p += 2;
                }
            }else{
                i++;
            }
        }

        return A;

    }

    public void swap(int[] A, int x, int y) {
        A[x] ^= A[y];
        A[y] ^= A[x];
        A[x] ^= A[y];
    }
}
