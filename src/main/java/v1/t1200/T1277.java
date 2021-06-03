package v1.t1200;

public class T1277 {
    int[][] matrix;
    public int countSquares(int[][] _matrix) {
        matrix = _matrix;
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                matrix[i][j] = sum + (i > 0 ? matrix[i - 1][j] : 0);
            }
        }

        res = matrix[matrix.length - 1][matrix[0].length - 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    continue;
                }
                int len = 1;
                while (validate(i, j, len)) {
                    res++;
                    len++;
                }
            }
        }

        return res;
    }

    public boolean validate(int i, int j, int len) {
        if (i + len >= matrix.length || j + len >= matrix[0].length) {
            return false;
        }

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        if (i > 0 && j > 0) {
            a = matrix[i - 1][j - 1];
        }

        if (i > 0) {
            b = matrix[i - 1][j + len];
        }

        if (j > 0) {
            c = matrix[i + len][j - 1];
        }

        d = matrix[i + len][j + len ];

        return d - c - b + a == (len+1) * (len+1);

    }

}
