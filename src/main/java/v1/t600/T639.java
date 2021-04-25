package v1.t600;

public class T639 {
    public static final int MOD = 1000000007;

    public int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }
        int p = 0;
        long x = 1;
        long y = 1;
        char c;
        char before = '-';
        while (p < s.length()) {
            int res = 0;

            c = s.charAt(p++);
            if (c == '*') {
                res += (x * 9) % MOD;
            } else if (c != '0') {
                res += (x) % MOD;
            }

            if (before == '*') {
                if (c == '*') {
                    res += (y * 15) % MOD;
                } else if (c >= '0' && c <= '6') {
                    res += (y * 2) % MOD;
                } else {
                    res += (y) % MOD;
                }
            } else if (before == '1') {
                if (c == '*') {
                    res += (y * 9) % MOD;
                } else {
                    res += (y) % MOD;
                }
            } else if (before == '2') {
                if (c == '*') {
                    res += (y * 6) % MOD;
                } else if (c >= '0' && c <= '6') {
                    res += (y) % MOD;
                }
            }


            before = c;
            y = x;
            x = res % MOD;
        }
        return (int) x;
    }


}
