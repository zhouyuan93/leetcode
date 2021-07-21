package v1.t1300;

public class T1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] res = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
                mat[i][j] = sum;
            }
        }


        for (int i = 0; i < mat[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum += mat[j][i];
                mat[j][i] = sum;
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                int x1 = i + k;
                int y1 = j + k;
                int x2 = i - k - 1;
                int y2 = j - k - 1;
                if (x1 >= res.length) {
                    x1 = res.length - 1;
                }
                if (y1 >= res[i].length) {
                    y1 = res[i].length - 1;
                }
                int a = mat[x1][y1];
                int b = 0;
                int c = 0;
                int d = 0;
                if (x2 >= 0) {
                    b = mat[x2][y1];
                }
                if (y2 >= 0) {
                    c = mat[x1][y2];
                }
                if (x2 >= 0 && y2 >= 0) {
                    d = mat[x2][y2];
                }
                res[i][j] = a - b - c + d;
            }
        }

        return res;
    }
}
