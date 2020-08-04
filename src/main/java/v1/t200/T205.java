package v1.t200;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T205 {
    public boolean isIsomorphic(String s, String t) {
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
