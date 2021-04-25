package v1.t600;

public class T639 {
    public static final int MOD = 1000000007;

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int p = 0;
        long x = 1;
        long y = 1;
        char c;
        char before = '-';
        while (p < s.length()) {
            long res = 0;

            c = s.charAt(p++);
            if (c == '*') {
                res += (x * 9);
                if (before == '*') {
                    res += y * 15;
                } else if (before == '1') {
                    res += y * 9;
                } else if (before == '2') {
                    res += y * 6;
                }
            } else if (c == '0') {
                if (before == '*') {
                    res += y * 2;
                } else if (before == '1' || before == '2') {
                    res += y;
                } else {
                    return 0;
                }
            } else if (c > '0' && c <= '6') {
                res += x;
                if (before == '*') {
                    res += y * 2;
                } else if (before == '1' || before == '2') {
                    res += y;
                }
            } else {
                res += x;
                if (before == '1' || before == '*') {
                    res += y;
                }
            }

            before = c;
            y = x;
            x = res % MOD;
        }
        return (int) x;
    }


}
