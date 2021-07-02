package v1.t1600;

import java.util.Arrays;

public class T1663 {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        Arrays.fill(res, 'a');
        k -= n;
        int p = n-1;
        while (k > 0) {
            if (k > 25) {
                res[p] = 'z';
                k -= 25;
            }else{
                res[p] += k;
                k = 0;
            }
            p--;
        }
        return new String(res);
    }
}
