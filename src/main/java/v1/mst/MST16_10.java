package v1.mst;

public class MST16_10 {
    public static final int N = 1900;
    public int maxAliveYear(int[] birth, int[] death) {
        int[] x = new int[203];
        int len = birth.length;

        for (int i = 0; i < len; i++) {
            x[birth[i]-N]++;
            x[death[i]+1-N]--;
        }

        int sum = 0;
        int res = 0;
        int idx = -1;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
            if (sum > res) {
                res = sum;
                idx = i;
            }
        }
        return idx + N;

    }
}
