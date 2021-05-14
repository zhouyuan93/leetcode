package v1.t1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1002 {
    public List<String> commonChars(String[] A) {
        int[] chars = new int[26];
        Arrays.fill(chars,Integer.MAX_VALUE);

        for (String s : A) {
            int[] temp = new int[26];
            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';
                temp[idx] = Math.min(chars[idx], temp[idx] + 1);
            }
            chars = temp;
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            String s = String.valueOf((char)(i + 'a'));
            while (chars[i]-- > 0) {
                list.add(s);
            }
        }

        return list;

    }
}
