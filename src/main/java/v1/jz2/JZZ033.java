package v1.jz2;

import java.util.*;

public class JZZ033 {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();


        for (String str : strs) {
            String key = get(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        List<List<String>> res = new ArrayList<>();
        res.addAll(map.values());
        return res;

    }

    public String get(String s) {
        int[] res = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            res[c - 'a']++;
        }
        return Arrays.toString(res);
    }

}
