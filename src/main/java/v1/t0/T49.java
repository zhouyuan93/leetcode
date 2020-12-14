package v1.t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author yuan.zhou
 */
public class T49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<Integer, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] key = new int[26];
            for (int i = 0; i < str.length(); i++) {
                key[str.charAt(i)-'a']++;
            }
            int keyHash = Arrays.hashCode(key);
            List<String> list = map.getOrDefault(keyHash, new ArrayList<>());
            list.add(str);
            map.put(keyHash, list);
        }

        List<List<String>> res = new ArrayList<List<String>>(map.values());
        return res;
    }
}
