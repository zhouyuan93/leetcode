package v1.t1700;

import javax.xml.bind.annotation.XmlID;

public class T1768 {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        char[] res = new char[m + n];
        int p = -1;

        int min = Math.min(m, n);
        for (int i = 0; i < min; i++) {
            res[++p] = word1.charAt(i);
            res[++p] = word2.charAt(i);
        }

        if (m > min) {
            for (int i = min; i < m; i++) {
                res[++p] = word1.charAt(i);
            }
        }

        if (n > min) {
            for (int i = min; i < n; i++) {
                res[++p] = word2.charAt(i);
            }
        }

        return new String(res);
    }
}
