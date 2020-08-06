package v1.t1300;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1329 {

    public int[][] diagonalSort(int[][] mat) {
        int i = mat.length - 1;
        int j = 0;

        while (i >= 0) {
            diagonalSort(mat, i--, j);
        }

        i++;
        j++;
        while (j < mat[0].length - 1) {
            diagonalSort(mat, i, j++);
        }

        return mat;

    }

    public void diagonalSort(int[][] mat, int i, int j) {
        int[] temp = new int[Math.min(mat.length - i, mat[0].length - j)];
        int x = 0;
        while (i != mat.length  && j != mat[0].length ) {
            temp[x++] = mat[i++][j++];
        }

        Arrays.sort(temp);

        while (x >= 1) {
            mat[--i][--j] = temp[--x];
        }
    }
}
