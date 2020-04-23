package v1;

/**
 * @author yuan.zhou
 */
public class T122 {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxP = -1;

        boolean canSale = false;
        int res = 0;

        for (int i : prices) {
            if (i < minP) {
                if (canSale) {
                    canSale = false;
                    res += maxP - minP;
                    maxP = -1;
                }
                minP = i;
            }else{
                if (maxP > i) {
                    canSale = false;
                    res += maxP - minP;
                    minP = i;
                    maxP = -1;
                }else{
                    maxP = i;
                    canSale = true;
                }
            }
        }

        if (maxP > minP) {
            res += maxP - minP;
        }

        return res;
    }
}
