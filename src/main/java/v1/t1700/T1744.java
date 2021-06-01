package v1.t1700;

public class T1744 {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        long[] sum = new long[candiesCount.length + 2];
        for (int i = 1; i <= candiesCount.length; i++) {
            sum[i] = sum[i - 1] + candiesCount[i - 1];
        }

        boolean[] res = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = canEat(sum, queries[i]);
        }
        return res;
    }

    public boolean canEat(long[] sum, int[] query) {
        int t = query[0], d = query[1] + 1, c = query[2];
        long a = sum[t] / c + 1;
        long b = sum[t + 1];
        return a <= d && d <= b;
    }
}
