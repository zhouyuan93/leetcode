package v1.t300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T336 {
    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                char[] iChar = words[i].toCharArray();
                char[] jChar = words[j].toCharArray();
                if (validateString(iChar, jChar)) {
                    res.add(Arrays.asList(i, j));
                }
                if (validateString(jChar, iChar)) {
                    res.add(Arrays.asList(j, i));
                }
            }
        }

        return res;
    }

    public boolean validateString(char[] left, char[] right) {

        int mid = (left.length + right.length) / 2;

        int i = 0;
        int j = right.length - 1;

        for (; i < left.length && j >= 0; i++, j--) {
            if (left[i] != right[j]) {
                return false;
            }
        }

        if (i < left.length) {
            int i2 = left.length - 1;
            for (; i < i2; i++, i2--) {
                if (left[i] != left[i2]) {
                    return false;
                }
            }
        }

        if (j >= 0) {
            int j2 = 0;
            for (; j2 < j; j2++, j--) {
                if (right[j2] != right[j]) {
                    return false;
                }
            }
        }

        return true;

    }
}
