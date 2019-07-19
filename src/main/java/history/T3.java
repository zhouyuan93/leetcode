package history;

import java.util.Map;
import java.util.TreeMap;

public class T3 {
    public static void main(String[] args) {
        T3 t = new T3();
        String s = "abcabcbacdb";
        System.out.println(t.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> map = new TreeMap();
        char[] chars = s.toCharArray();
        int p = 0;
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i]) && map.get(chars[i]) >= p){
                res = res > (i-p) ? res : i-p;
                p = map.get(chars[i])+1;
            }
            map.put(chars[i], i);
        }
        res = res > (chars.length-p) ? res : chars.length-p;
        return res;
    }
}
