package v1.t900;

public class T926 {
    public int minFlipsMonoIncr(String s) {
        char[] c = s.toCharArray();

        int[] one = new int[c.length];

        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') {
                count++;
            }
            one[i] = count;
        }

        int res = one[c.length - 1];
         count = 0;
        for (int i = c.length - 1; i > 0; i--) {
            if (c[i] == '0') {
                count++;
            }
            res = Math.min(res, count + one[i - 1]);
        }
        if (c[0] == '0') {
            count++;
        }
        res = Math.min(res, count);

        return res ;

    }
}
