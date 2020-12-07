package v1.t800;

/**
 * @author yuan.zhou
 */
public class T861 {
    public int matrixScore(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return 0;
        }

        //将第一列更新为1, 横向转换
        for (int i = 0; i < A.length; i++) {
            int x = A[i][0];
            if (x != 1) {
                for (int j = 1; j < A[i].length; j++) {
                    A[i][j] ^= 1;
                }
            }
        }

        int res =  (1 << (A[0].length-1)) * A.length;

        //剩下列取最大值
        for (int j = 1; j < A[0].length; j++) {
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i][j] == 1) {
                    count++;
                }
            }
            count = Math.max(count, A.length - count);
            res += (1 << (A[0].length - j - 1)) * count;
        }

        return res;
    }
}
