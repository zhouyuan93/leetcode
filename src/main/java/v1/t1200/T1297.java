package v1.t1200;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T1297 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        Map<Character, Integer> map = new HashMap<>();

        char[] sc = s.toCharArray();

        Map<String, Integer> res = new HashMap<>();

        int resMax = 0;

        //初始化第一个字符串
        for (int j = 0; j < minSize; j++) {
            char key = sc[j];
            int value = map.getOrDefault(key, 0) + 1;
            map.put(key, value);
        }
        if (map.size() <= maxLetters) {
            String t = new String(sc, 0, minSize);
            res.put(t, 1);
            resMax++;
        }

        //按minSize循环
        for (int i = minSize; i < sc.length; i++) {
            char removeKey = sc[i - minSize];
            char key = sc[i];
            int removeValue = map.get(removeKey);
            int value = map.getOrDefault(key, 0);
            if (removeKey != key) {
                removeValue -= 1;
                value += 1;
                map.put(key, value);
                if (removeValue == 0) {
                    map.remove(removeKey);
                } else {
                    map.put(removeKey, removeValue);
                }
            }

            if (map.size() <= maxLetters) {
                String t = new String(sc, i - minSize + 1, minSize);
                int count = res.getOrDefault(t, 0) + 1;
                res.put(t, count);
                resMax = Math.max(resMax, count);
            }

        }

        return resMax;

    }
}
