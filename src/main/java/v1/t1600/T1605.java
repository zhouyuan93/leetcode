package v1.t1600;

public class T1605 {
    int m;
    int n;
    int[][] b;
    int[] rowSum;
    int[] colSum;

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        m = rowSum.length;
        n = colSum.length;
        this.rowSum = rowSum;
        this.colSum = colSum;
        b = new int[m][n];

        long count = 0;
        for (int i = 0; i < m; i++) {
            b[i][0] = rowSum[i];
            count += rowSum[i];
        }

        for (int x = 0; x < n; x++) {
            long more = count - colSum[x];
            count = more;
            if (more > 0) {
                int y = 0;
                while (more > 0) {
                    if (more > b[y][x]) {
                        b[y][x + 1] = b[y][x];
                        more -= b[y][x];
                        b[y][x] = 0;
                    } else {
                        b[y][x + 1] = (int) more;
                        b[y][x] -= more;
                        more = 0;
                    }
                    y++;
                }
            }
        }

        return b;

    }
}
