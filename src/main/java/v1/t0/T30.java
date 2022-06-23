package v1.t0;

import java.util.*;

public class T30 {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();

        Map<String, Integer> unUse = new HashMap<>(words.length * 4 / 3);

        for (String word : words) {
            unUse.put(word, unUse.getOrDefault(word, 0) + 1);
        }

        int len = words[0].length();
        int min = len * words.length;
        int count = 0;

        if (s.length() < min) {
            return res;
        }

        for (int i = 0; i < len; i++) {
            int l, r;
            for (l = i, r = i + len; r <= s.length(); l = r, r += len) {
                String t = s.substring(l, r);
                if (unUse.getOrDefault(t, 0) > 0) {
                    unUse.put(t, unUse.get(t) - 1);
                    count++;
                    if (count == words.length) {
                        int start = r - min;
                        res.add(start);
                        String ss = s.substring(start, start + len);
                        unUse.put(ss, unUse.get(ss) + 1);
                        count--;
                    }
                } else if (unUse.containsKey(t)) {
                    int start = l - count * len;
                    String ss = s.substring(start, start + len);
                    while (!ss.equals(t)) {
                        unUse.put(ss, unUse.get(ss) + 1);
                        count--;
                        start += len;
                        ss = s.substring(start, start + len);
                    }
                } else {
                    int start = l - count * len;
                    while (start < l && start >= 0) {
                        String ss = s.substring(start, start + len);
                        unUse.put(ss, unUse.get(ss) + 1);
                        count--;
                        start += len;
                    }
                }
            }

            int start = l - (count) * len;
            while (count>0) {
                String ss = s.substring(start, start + len);
                unUse.put(ss, unUse.get(ss) + 1);
                count--;
                start += len;
            }
        }

        return res;
    }

}
