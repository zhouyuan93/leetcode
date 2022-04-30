package weekend.zd20220430;

public class T2 {
    public int minimumAverageDifference(int[] nums) {
        long[] sum = new long[nums.length];
        int len = nums.length;

        long x = 0;
        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
            sum[i] = x;
        }

        int res = 0;
        long min = Integer.MAX_VALUE;

        for (int i = 0; i < len-1; i++) {
            long t = getCha(i, sum);
            if (t < min) {
                res = i;
                min = t;
            }
        }

        long t = sum[len-1]/len;
        if (t < min) {
            return len-1;
        }

        return res;
    }

    public long getCha(int i, long[] sum) {
        int len = sum.length;
        long l = sum[i] / (i+1);
        long r = (sum[len - 1] - sum[i]) / (len - (i + 1));
        return Math.abs(l - r);
    }
}
