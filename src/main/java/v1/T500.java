package v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T500 {
    boolean[] q = {false, false, false, false, true, false, false, false, true, false, false, false, false, false,
            true, true, true, true, false, true, true, false, true, false, true, false, false, false, false, false,
            false, false, false, false, false, false, true, false, false, false, true, false, false, false, false,
            false, true, true, true, true, false, true, true, false, true, false, true, false, false, false, false,
            false, false, false};
    boolean[] a = {true, false, false, true, false, true, true, true, false, true, true, true, false, false, false,
            false, false, false, true, false, false, false, false, false, false, false, false, false, false, false,
            false, false, true, false, false, true, false, true, true, true, false, true, true, true, false, false,
            false, false, false, false, true, false, false, false, false, false, false, false, false, false, false,
            false, false, false};
    boolean[] z = {false, true, true, false, false, false, false, false, false, false, false, false, true, true, false,
            false, false, false, false, false, false, true, false, true, false, true, false, false, false, false, false,
            false, false, true, true, false, false, false, false, false, false, false, false, false, true, true, false,
            false, false, false, false, false, false, true, false, true, false, true, false, false, false, false, false,
            false};

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (checkWords(word)) {
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    private boolean checkWords(String s) {
        if (s.length() < 2) {
            return true;
        }
        int oneLocation = s.charAt(0) - 'A';
        boolean[] temp  = q[oneLocation]?q:a[oneLocation]?a:z;
        for (int i = 0; i < s.length(); i++) {
            if (!temp[s.charAt(i) - 'A']) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String q = "qwertyuiopQWERTYUIOP";

        String z = "zxcvbnmZXCVBNM";

        trans(q);
        trans(z);

    }

    static void trans(String s) {
        boolean[] c = new boolean[64];
        for (char c1 : s.toCharArray()) {
            c[c1 - 'A'] = true;
        }
        System.out.println(Arrays.toString(c));
    }



}