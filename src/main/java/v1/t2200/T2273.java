package v1.t2200;

import java.util.ArrayList;
import java.util.List;

public class T2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        if (words == null || words.length == 0) {
            return res;
        }

        res.add(words[0]);

        String p = words[0];

        for (int i = 1; i < words.length; i++) {
            String t = words[i];
            if (p.length() != t.length() || !equalAnagrams(p, t)) {
                res.add(t);
                p = t;
            }
        }

        return res;
    }

    private boolean equalAnagrams(String p, String t) {
        int[] memo = new int[26];

        for (int i = 0; i < p.length(); i++) {
            memo[p.charAt(i)-'a']++;
            memo[t.charAt(i)-'a']--;
        }

        for (int i : memo) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
