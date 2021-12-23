package v1.t600;

public class T686 {

    public int repeatedStringMatch(String a, String b) {

        int[] next = getNextArray(b);

        int bi = 0;
        int bLen = b.length();
        int aLen = a.length();
        int max = bLen + aLen * 2;
        for (int ai = 0; ai <= max;) {
            if (bi == -1 || a.charAt(ai % aLen) == b.charAt(bi)) {
                bi++;
                ai++;
                if (bi >= bLen) {
                    int x = ai / aLen;
                    if (ai % aLen > 0) {
                        x++;
                    }
                    return x;
                }
            }else{
                bi = next[bi];
            }
        }

        return -1;

    }

    public int[] getNextArray(String s) {
        int len = s.length();

        int[] next = new int[s.length()];

        int p = -1;

        next[0] = -1;

        int i = 0;

        while (i < len - 1) {
            if (p == -1 || s.charAt(p) == s.charAt(i)) {
                p++;
                i++;
                next[i] = p;
            } else {
                p = next[p];
            }
        }

        return next;
    }

}
