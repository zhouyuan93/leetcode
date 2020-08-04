package v1.t100;

/**
 * @author yuan.zhou
 */
public class T121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int res = 0;
        int max = prices[prices.length - 1];

        for (int i = prices.length - 1; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            res = Math.max(res, max - prices[i]);
        }

        return res;
    }
}
