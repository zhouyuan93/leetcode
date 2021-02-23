package v1.t1500;

/**
 * @author yuan.zhou
 */
public class T1537 {
    public int diagonalSum(int[][] mat) {
        int res = 0;

        for (int i = 0; i < mat.length; i++) {
            res += mat[i][i] + mat[i][mat.length -1 - i];
        }
        if (mat.length % 2 == 1) {
            int x = (mat.length - 1) / 2;
            res -= mat[x][x];
        }

        return res;
    }
}
