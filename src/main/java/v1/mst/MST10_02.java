package v1.mst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MST10_02 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String , List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] memo = new int[26];
            for (int i = 0; i < str.length(); i++) {
                memo[str.charAt(i) - 'a']++;
            }
            String s = Arrays.toString(memo);
            if (!map.containsKey(s)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s, list);
            }else{
                map.get(s).add(str);
            }
        }

        return new ArrayList<>(map.values());

    }
}
