package v1.t400;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T402 {

    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        char[] chars = num.toCharArray();
        int i = -1;

        for (int j = 0; j < chars.length; j++) {
            while (i >= 0 && chars[i] > chars[j] && k > 0) {
                i--;
                k--;
            }
            chars[++i] = chars[j];
        }
        while (k > 0) {
            i--;
            k--;
        }
        int j = 0;
        while (j < i && chars[j] == '0') {
            j++;
        }
        return new String(chars, j, i - j + 1);
    }

    public String removeKdigits2(String num, int k) {
        if (num == null || num.length() == k) {
            return "0";
        }
        char[] chars = num.toCharArray();
        StringBuilder res = new StringBuilder();
        remove(chars, k, 0, res);
        if (res.length() == 0) {
            return "0";
        }
        return res.toString();
    }

    public void remove(char[] chars, int k, int begin, StringBuilder res) {
        if (k == 0) {
            res.append(chars, begin, chars.length - begin);
            return;
        }
        if (chars.length - begin == k) {
            return;
        }
        int min = chars[begin] - '0';
        int minI = begin;
        for (int i = begin + 1; i < begin + k + 1 && min != 0; i++) {
            int x = chars[i] - '0';
            if (x < min) {
                min = x;
                minI = i;
            }
        }
        if (res.length() != 0 || min != 0) {
            res.append(min);
        }
        k = k - (minI - begin);
        begin = minI + 1;
        remove(chars, k, begin, res);
    }

}
