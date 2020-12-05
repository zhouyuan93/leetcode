package v1.t1500;

/**
 * @author yuan.zhou
 */
public class T1578 {

    public int minCost(String s, int[] cost) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        int res = 0;
        int max = 0;

        char c1 = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char c2 = s.charAt(i);
            if (c1 == c2) {
                res += cost[i-1];
                max = Math.max(max, cost[i-1]);
            }else{
                if (max > 0) {
                    res += cost[i-1];
                    max = Math.max(max, cost[i-1]);
                    res -= max;
                    max = 0;
                }
            }
            c1 = c2;
        }

        //最后一位判断
        if (s.charAt(s.length() - 1) == c1) {
            res += cost[cost.length - 1];
            res -= Math.max(max, cost[cost.length - 1]);
        }

        return res;

    }

}
