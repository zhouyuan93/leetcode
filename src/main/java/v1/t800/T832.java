package v1.t800;

/**
 * @author yuan.zhou
 */
public class T832 {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return A;
        }

        int len = A[0].length - 1;
        for (int[] array : A) {
            for (int i = 0; i < len / 2; i++) {
                int j = len - i;
                array[i] ^= array[j];
                array[j] ^= array[i] ^ 1;
                array[i] ^= array[j];
            }
            if (len % 2 == 0) {
                array[len/2]^=1;
            }else{
                int i = len / 2;
                int j = i + 1;
                array[i] ^= array[j];
                array[j] ^= array[i] ^ 1;
                array[i] ^= array[j];
            }
        }

        return A;
    }
}
