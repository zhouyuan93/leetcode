package v1.jz;

import java.util.HashMap;

/**
 * @author yuan.zhou
 */
public class JZ48 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        char[] sChars = s.toCharArray();
        int max = 0;
        int fq = -1;
        for (int i = 0; i < sChars.length; i++) {
            char c = sChars[i];
            int y = map.getOrDefault(c,-1);
            map.put(c, i);

            if (y == -1 && fq == -1) {
                max = Math.max(max, i+1);
            }else if (y == -1 && fq != -1) {
                max = Math.max(max, i - fq);
            }else if (y != -1 && fq == -1) {
                fq = y;
                max = Math.max(max, i - fq);
            }else if (y != -1 && fq != -1) {
                if (y >= fq) {
                    fq = y;
                }else{
                    max = Math.max(max, i - fq);
                }
            }
        }

        max = fq == -1 ? sChars.length : Math.max(max, sChars.length - fq - 1);

        return max;
    }
}
