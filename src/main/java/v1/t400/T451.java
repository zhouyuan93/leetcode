package v1.t400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author yuan.zhou
 */
public class T451 {
    public String frequencySort(String s) {
        char[] sChars = s.toCharArray();

        Arrays.sort(sChars);

        int left = 0;

        List<String> list = new ArrayList<>();

        for (int i = 1; i < sChars.length; i++) {
            if (sChars[i] != sChars[left]) {
                list.add(String.valueOf(sChars, left, i - left));
                left = i;
            }
        }
        list.add(String.valueOf(sChars, left, sChars.length - left));

        list.sort(Comparator.comparingInt(x -> x.length()));

        StringBuilder res = new StringBuilder();
        for (int i = list.size()-1; i >= 0; i--) {
            res.append(list.get(i));
        }

        return res.toString();
    }
}
