package v1.jz2;

public class JZZ092 {
    public int minFlipsMonoIncr(String s) {

        int zero  = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero++;
            }
        }

        int res = zero;
        int one = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                zero--;
            }
            res = Math.min(res, one + zero);
            if (c == '1') {
                one++;
            }
        }

        return res;
    }
}
