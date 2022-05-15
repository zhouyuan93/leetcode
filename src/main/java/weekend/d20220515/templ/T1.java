package weekend.d20220515.templ;

import java.util.LinkedList;
import java.util.List;

public class T1 {
    public List<String> removeAnagrams(String[] words) {

        List<String> res = new LinkedList<>();

        int[] t = get(words[0]);
        res.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            int[] p = get(words[i]);
            if (!equal(t, p)) {
                res.add(words[i]);
                t = p;
            }
        }

        return res;
    }

    public boolean equal(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] get(String s) {
        int[] t = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            t[c-'a']++;
        }

        return t;
    }

}
