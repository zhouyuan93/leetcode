package v1.t300;

/**
 * @author yuan.zhou
 */
public class T363 {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == k) {
                    return k;
                }
                if (matrix[i][j] < k) {
                    res = Math.max(res, matrix[i][j]);
                }
                sum += matrix[i][j];
                matrix[i][j] = sum;
            }

            res = Math.max(res, maxSumSub(matrix[i], k, res));
            if(res == k){
                return k;
            }

            for (int m = i - 1; m >= 0; m--) {
                for (int n = 0; n < matrix[m].length; n++) {
                    matrix[m][n] += matrix[i][n];
                }
                res = Math.max(res, maxSumSub(matrix[m], k, res));
                if(res == k){
                    return k;
                }
            }

        }

        return res;
    }

    public int maxSumSub(int[] row, int k, int res) {
        for (int len = 1; len < row.length; len++) {
            for (int i = 0; i < row.length - len; i++) {
                int before = i == 0 ? 0 : row[i - 1];
                int temp = row[i + len] - before;
                if (temp == k) {
                    return temp;
                } else if (temp < k) {
                    res = Math.max(temp, res);
                }
            }
        }
        return res;
    }

}