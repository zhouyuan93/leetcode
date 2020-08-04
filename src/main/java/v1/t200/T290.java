package v1.t200;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> memory = new HashMap<>(pattern.length());

        String[] s = str.split(" ");
        char[] patternChars = pattern.toCharArray();

        if (s.length != patternChars.length) {
            return false;
        }

        for (int i = 0; i < s.length; i++) {
            if (memory.containsKey(patternChars[i])) {
                if (!memory.get(patternChars[i]).equals(s[i])) {
                    return false;
                }
            } else if (memory.containsValue(s[i])) {
                return false;
            } else {
                memory.put(patternChars[i], s[i]);
            }
        }

        return true;

    }
}
