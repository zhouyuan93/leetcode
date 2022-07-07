package v1.t1600;

public class T1653 {
    public int minimumDeletions(String s) {
        char[] chars = s.toCharArray();

        int ca = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                ca++;
            }
        }
        int cb = chars.length - ca;

        int res = ca;
        int t = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a') {
                t++;
            }else{
                ca--;
            }
            res = Math.min(res, t + ca);
        }

        res = Math.min(res, cb);

        return res;

    }
}
