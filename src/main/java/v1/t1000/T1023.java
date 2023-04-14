package v1.t1000;

import java.util.ArrayList;
import java.util.List;

public class T1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i <= queries.length; i++) {
            String query = queries[i];
            boolean r = camelMatch(query, pattern);
            list.add(r);
        }

        return list;
    }

    private boolean camelMatch(String query, String pattern) {
        char[] yc = query.toCharArray();
        char[] xc = pattern.toCharArray();

        Boolean[][] dp = new Boolean[yc.length][xc.length];

        boolean t = getDp(yc, xc, dp, yc.length - 1, xc.length - 1);

        return t;
    }

    private boolean getDp(char[] yc, char[] xc, Boolean[][] dp, int yi, int xi) {
        if (yi < 0) {
            return xi < 0;
        }else{
            if (xi < 0) {
                for (int i = 0; i < yi; i++) {
                    if (!isLowerCase(yc[i])) {
                        return false;
                    }
                }
                return true;
            }
        }

        if (dp[yi][xi] != null) {
            return dp[yi][xi];
        }

        boolean res;
        if (yc[yi] == xc[xi]) {
            res = getDp(yc, xc, dp, yi - 1, xi - 1);
        }else if(isLowerCase(yc[yi])){
            res = getDp(yc, xc, dp, yi - 1, xi);
        }else{
            res = false;
        }

        dp[yi][xi] = res;

        return res;
    }

    private boolean isLowerCase(char c) {
        return 'a' <= c && c <= 'z';
    }

}
