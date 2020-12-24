package v1.t100;

/**
 * @author yuan.zhou
 */
public class T135 {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        int len = 1;
        int p = ratings[ratings.length - 1];
        int pCandy = 1;
        int res = 1;
        int title = -1;
        for (int i = ratings.length - 2; i >= 0; i--) {
            int next = ratings[i];
            if (next > p) {
                len = -1;
                pCandy++;
                res += pCandy;
                p = next;
            } else if (next < p) {
                if (len == -1) {
                    if (pCandy == 1) {
                        len = 2;
                        res += 2;
                        pCandy = 1;
                        p = next;
                        title = -1;
                    }else{
                        title = pCandy;
                        res += 1;
                        p = next;
                        pCandy = 1;
                        len = 1;
                    }
                }else{
                    len++;
                    res += len;
                    if (title != -1 && len >= title) {
                        res += 1;
                    }
                    p = next;
                    pCandy = 1;
                }
            }else{
                    p = next;
                    pCandy = 1;
                    res += pCandy;
                    len = 1;
                    title = -1;
            }
        }

        return res;

    }
}
