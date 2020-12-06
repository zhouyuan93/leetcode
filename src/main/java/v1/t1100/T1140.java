package v1.t1100;

/**
 * @author yuan.zhou
 */
public class T1140 {

    public int stoneGameII(int[] piles) {
        int len = piles.length;

        //初始化sum
        int[] pilesSum = new int[piles.length];
        int sum = 0;
        for (int i = pilesSum.length - 1; i >= 0; i--) {
            sum += piles[i];
            pilesSum[i] = sum;
        }

        //m可能取到的最大值
        int mMax =(len + 1) / 2 + 1;

        //dp数组
        Integer[][] dp = new Integer[mMax][len];

        int begin = 0;
        int m = 1;
        return getDp(m, begin, dp, piles, pilesSum);

    }

    public int getDp(int m, int begin, Integer[][] dp, int[] piles , int[] pilesSum) {
        if (dp[m][begin] == null) {
            //可以全部取走,则全部取走
            if (2 * m >= piles.length - begin) {
                dp[m][begin] = pilesSum[begin];
                return pilesSum[begin];
            }

            //不可以全部取走
            int count = pilesSum[begin];
            int max = 0;
            //dp没有初始化
            for (int x = 1; x <= m * 2; x++) {
                max = Math.max(max, count - getDp(Math.max(x, m), begin + x, dp, piles, pilesSum));
            }
            dp[m][begin] = max;
            return max;
        }
        return dp[m][begin];
    }




}
