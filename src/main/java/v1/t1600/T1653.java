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

    public int minimumDeletions2(String s) {
        char[] sc = s.toCharArray();
        int a, b;

        if (sc[0] == 'a') {
            a = 0;
            b = 1;
        } else {
            a = 1;
            b = 0;
        }

        int len = sc.length;
        for (int i = 1; i < len; i++) {
            char c = sc[i];
            if (c == 'a') {
                b++;
            } else {
                b = Math.min(a, b);
                a++;
            }
        }

        return Math.min(a, b);
    }
}
