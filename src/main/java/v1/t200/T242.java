package v1.t200;

/**
 * @author yuan.zhou
 */
public class T242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] memory = new int[26];
        for (char c : s.toCharArray()) {
            memory[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            memory[c - 'a']--;
            if (memory[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
