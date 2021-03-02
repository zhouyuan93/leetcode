package v1.t300;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T304 {
    static class NumMatrix {
        int[][] mSum;
        public NumMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                mSum = null;
                return;
            }

            for (int j = 0,sum = 0; j < matrix[0].length; j++) {
                sum += matrix[0][j];
                matrix[0][j] = sum;
            }

            for (int i = 1; i < matrix.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix[0].length; j++) {
                    sum += matrix[i][j];
                    matrix[i][j] = sum + matrix[i - 1][j];
                }
            }

            mSum = matrix;

        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            if (mSum == null) {
                return 0;
            }
            int x1 = 0;
            if (row1 > 0 && col1 > 0) {
                x1 = mSum[row1 - 1][col1 - 1];
            }
            int x2 = 0;
            if (row1 > 0) {
                x2 = mSum[row1 - 1][col2];
            }
            int x3 = 0;
            if (col1 > 0) {
                x3 = mSum[row2][col1 - 1];
            }
            int x4 = mSum[row2][col2];
            return x4 - x3 - x2 + x1;
        }
    }
}
