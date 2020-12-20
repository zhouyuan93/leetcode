package v1.t300;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T316 {
    public String removeDuplicateLetters(String s) {
        boolean[] isExists = new boolean[26];
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isExists[c - 'a']) {
                while (res.length() > 0 && res.charAt(res.length() - 1) > c) {
                    if (count[res.charAt(res.length() - 1) - 'a'] > 0) {
                        isExists[res.charAt(res.length() - 1) - 'a'] = false;
                        res.deleteCharAt(res.length() - 1);
                    }else{
                        break;
                    }
                }
                isExists[c - 'a'] = true;
                res.append(c);
            }
            count[c - 'a']--;
        }

        return res.toString();

    }
}
