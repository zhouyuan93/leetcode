package v1.t300;

import java.util.TreeSet;

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

    public int maxSumSubmatrix2(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;

        // 预处理前缀和 这里可以m , n 交换
        int[][] sum = new int[m+1][n+1];
        for (int i = 1; i <= mat.length; i++) {
            for (int j = 1; j <= mat[i].length; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }

        int res = Integer.MIN_VALUE;
        for (int top = 1; top <= m; top++) {
            for (int bot = top; bot <= m; bot++) {
                TreeSet<Integer> ts = new TreeSet<>();
                ts.add(0);
                for (int r = 1; r < n; r++) {
                    int right = sum[bot][r] - sum[top - 1][r];
                    Integer left = ts.ceiling(right - k);
                    if (left != null) {
                        int cur = right - left;
                        res = Math.max(res, cur);
                    }
                    ts.add(right);
                }
            }
        }

        return res;
    }

}