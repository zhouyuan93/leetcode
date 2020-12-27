package v1.t200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Integer, Integer> trans = new HashMap<>();
        Set<Integer> transValue = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int sa = s.charAt(i) - 'a';
            int ta = t.charAt(i) - 'a';

            if (!trans.containsKey(sa)) {
                if (transValue.contains(ta)) {
                    return false;
                }
                trans.put(sa, ta);
                transValue.add(ta);
            } else {
                sa = trans.get(sa);
                if (ta != sa) {
                    return false;
                }
            }
        }

        return true;

    }
    public boolean isIsomorphic_2(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        char[] changeS = new char[26];
        char[] changeT = new char[26];

        Map<Character, Character> shm = new HashMap<>();
        Map<Character, Character> chm = new HashMap<>();

        for (int i = 0; i < sc.length; i++) {
            if (!shm.containsKey(sc[i])) {
                shm.put(sc[i], tc[i]);
            } else if (shm.get(sc[i]) != tc[i]) {
                return false;
            }
            if (!chm.containsKey(tc[i])) {
                chm.put(tc[i], sc[i]);
            } else if (chm.get(tc[i]) != sc[i]) {
                return false;
            }
        }

        return true;

    }
}
