package v1.t1500;

public class T1544 {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();

        int p = 0;
        int i = 1;
        while (i < chars.length) {
            if (Math.abs(get(chars[p]) - get(chars[i])) == 26) {
                p--;
                i++;
                if (i >= chars.length) {
                    break;
                }

                if (p < 0) {
                    chars[++p] = chars[i++];
                }
            } else {
                chars[++p] = chars[i++];
            }
        }

        return new String(chars, 0, p + 1);

    }

    public int get(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 26;
        }
        return -1;
    }
}
