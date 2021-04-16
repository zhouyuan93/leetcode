package v1.t0;

import java.util.HashMap;
import java.util.Map;

public class T87 {
    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() == 1 && s1.equals(s2)) {
            return true;
        }
        Map<Integer, Map<Integer, Boolean>> map = new HashMap<>(s1.length() * s1.length() * 2);
        boolean res = isScramble(s1, s2, 0, s1.length()-1, 0, s2.length()-1, map);

        return res;
    }


    public boolean isScramble(String s1, String s2, int left1, int right1, int left2, int right2,
                              Map<Integer, Map<Integer, Boolean>> map) {
        if (right1 == left1 && s1.charAt(left1) == s2.charAt(left2)) {
            return true;
        }

        int index1 = left1 * 100 + right1;
        int index2 = left2 * 100 + right2;
        if (map.containsKey(index1)) {
            if (map.get(index1).containsKey(index2)) {
                return map.get(index1).get(index2);
            }
        }

        // 正向
        int count1 = 0;
        int count2 = 0;
        int[] arr = new int[26];
        for (int i = left1, j = left2; i < right1; i++, j++) {
            int c1 = s1.charAt(i) - 'a';
            int c2 = s2.charAt(j) - 'a';

            if (arr[c1] < 0) {
                count2--;
            } else {
                count1++;
            }
            arr[c1]++;

            if (arr[c2] > 0) {
                count1--;
            } else {
                count2++;
            }
            arr[c2]--;

            if (count1 == 0 && count2 == 0) {
                if (isScramble(s1, s2, left1, i, left2, j, map)
                        && isScramble(s1, s2, i + 1, right1, j + 1, right2, map)) {
                    Map<Integer, Boolean> temp =  map.getOrDefault(index1, new HashMap<>());
                    temp.put(index2, false);
                    map.put(index1, temp);
                    return true;
                }
            }

        }

        // 反向
        count1 = 0;
        count2 = 0;
        arr = new int[26];
        for (int i = left1, j = right2; i < right1; i++, j--) {
            int c1 = s1.charAt(i) - 'a';
            int c2 = s2.charAt(j) - 'a';

            if (arr[c1] < 0) {
                count2--;
            } else {
                count1++;
            }
            arr[c1]++;

            if (arr[c2] > 0) {
                count1--;
            } else {
                count2++;
            }
            arr[c2]--;

            if (count1 == 0 && count2 == 0) {
                if (isScramble(s1, s2, left1, i, j, right2, map)
                        && isScramble(s1, s2, i + 1, right1, left2, j - 1, map)) {
                    Map<Integer, Boolean> temp =  map.getOrDefault(index1, new HashMap<>());
                    temp.put(index2, false);
                    map.put(index1, temp);
                    return true;
                }
            }
        }


        Map<Integer, Boolean> temp =  map.getOrDefault(index1, new HashMap<>());
        temp.put(index2, false);
        map.put(index1, temp);
        return false;

    }
}
