package weekend.d20210725;

public class T3 {

    int res;
    int r = 0;
    private int m;
    private int n;

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        m = students.length;
        n = students[0].length;
        res = 0;

        int[][] memo = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                memo[i][j] = get(students[i], mentors[j]);
            }
        }

        boolean[] e = new boolean[m];
        dfs(memo, e, 0, 0);

        return res;
    }

    private void dfs(int[][] memo, boolean[] e, int p, int count) {
        if (p >= m) {
            res = Math.max(count, res);
            return;
        }

        for (int j = 0; j < m; j++) {
            if (e[j]) {
                continue;
            }
            e[j] = true;
            dfs(memo, e, p + 1, count + memo[p][j]);
            e[j] = false;
        }
    }

    public int get(int[] x, int[] y) {
        int res = x.length;
        for (int i = 0; i < x.length; i++) {
            res -= x[i] ^ y[i];
        }
        return res;
    }


}
